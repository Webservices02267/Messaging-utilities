package messaging.implementations;

import java.io.IOException;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

import com.google.gson.Gson;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;

import messaging.Event;
import messaging.MessageQueue;

public class RabbitMqQueue implements MessageQueue {

	private static final String DEFAULT_HOSTNAME = "rabbitMq";
	private static final String EXCHANGE_NAME = "eventsExchange";
	private static final String QUEUE_TYPE = "topic";
	private String hostname;
	private Channel channel;

	public RabbitMqQueue() {
		this(DEFAULT_HOSTNAME);
	}

	public RabbitMqQueue(String hostname) {
		String envHostname = System.getenv("RABBIT_MQ_HOSTNAME");
		if(envHostname != null) 
		{
			System.out.println("Connects to RabbitMQ hostname: " + envHostname);
			channel = setUpChannel(envHostname);
			this.hostname = envHostname;
		}
		else
		{
			System.out.println("Connects to RabbitMQ hostname: " + hostname);
			channel = setUpChannel(hostname);
			this.hostname = hostname;
		}
	}

	@Override
	public void publish(Event event) {
		String message = new Gson().toJson(event);
		System.out.println("[x] Publish event " + message);
		try {
			channel.basicPublish(EXCHANGE_NAME, event.getType(), null, message.getBytes("UTF-8"));
		} catch (IOException e) {
			throw new Error(e);
		}
	}

	private Channel setUpChannel(String hostname) {
		Channel channel;
		try {
			System.out.println(hostname);
			ConnectionFactory factory = new ConnectionFactory();
			factory.setHost(hostname);
			Connection connection = factory.newConnection();
			channel = connection.createChannel();
			channel.exchangeDeclare(EXCHANGE_NAME, QUEUE_TYPE);
		} catch (IOException | TimeoutException e) {
			throw new Error(e);
		}
		return channel;
	}

	@Override
	public void addHandler(String topic, Consumer<Event> handler) {
		channel = setUpChannel(hostname);
		System.out.println("[x] handler " + handler + " added for event topic: " + topic);
		try {
			String queueName = channel.queueDeclare().getQueue();
			channel.queueBind(queueName, EXCHANGE_NAME, topic);

			DeliverCallback deliverCallback = (consumerTag, delivery) -> {
				String message = new String(delivery.getBody(), "UTF-8");
				
				Event event = new Gson().fromJson(message, Event.class);
				
				System.out.println("[x] handle event "+message);
				
				handler.accept(event);
			};
			channel.basicConsume(queueName, true, deliverCallback, consumerTag -> {
			});
		} catch (IOException e1) {
			throw new Error(e1);
		}
	}

}