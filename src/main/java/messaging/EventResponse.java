package messaging;
import java.util.Arrays;

import com.google.gson.Gson;

public class EventResponse {

    private String sessionId;
    private boolean success;
    private String errorMessage;
    private Object[] arguments;

    public EventResponse(String sessionId, boolean success, String errorMessage, Object... arguments) {
        this.sessionId = sessionId;
        this.success = success;
        this.errorMessage = errorMessage;
        this.arguments = arguments;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Object[] getArguments() {
        return arguments;
    }

    public void setArguments(Object... arguments) {
        this.arguments = arguments;
    }

    @Override
	public String toString() {
		return "EventResponse [sessionId=" + sessionId + ", success=" + success + ", errorMessage=" + errorMessage
				+ ", arguments=" + Arrays.toString(arguments) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(arguments);
		result = prime * result + ((errorMessage == null) ? 0 : errorMessage.hashCode());
		result = prime * result + ((sessionId == null) ? 0 : sessionId.hashCode());
		result = prime * result + (success ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EventResponse other = (EventResponse) obj;
		if (!Arrays.deepEquals(arguments, other.arguments))
			return false;
		if (errorMessage == null) {
			if (other.errorMessage != null)
				return false;
		} else if (!errorMessage.equals(other.errorMessage))
			return false;
		if (sessionId == null) {
			if (other.sessionId != null)
				return false;
		} else if (!sessionId.equals(other.sessionId))
			return false;
		if (success != other.success)
			return false;
		return true;
	}

	public <T> T getArgument(int i, Class<T> cls) {
        // The hack is needed because of Events are converted
        // to JSon for transport. Because JSon does not store
        // the class of an Object, when deserializing the arguments
        // of an Event, LinkedTreeLists are returned, which cannot be
        // cast to real objects or converted to JSonObjects.
        // The trick is to generated a JSon string from the argument and
        // then parse that string back to the class one needs.
        // This also works, for tests, where the arguments to an Event contain
        // the original objects.
        var gson = new Gson();
        var jsonString = gson.toJson(arguments[i]);
        return gson.fromJson(jsonString, cls);
    }
}
