package messaging;

public class GLOBAL_STRINGS {


    public static class OK_STRINGS{
        public static final String ALL_GOOD= "All good";
    }


    public static class TOKEN_SERVICE{

        public static class OK_STRINGS{
            public static final String SANITY_CHECK = "Sanity check for account service";

        }

        public static class HANDLE {


            public static final String TOKEN_STATUS_REQUESTED = "TokenStatusRequested";
            public static final String CUSTOMER_VERIFICATION_REQUESTED = "CustomerVerificationRequested";
            public static final String TOKEN_VERIFICATION_REQUESTED = PAYMENT_SERVICE.PUBLISH.GET_CUSTOMER_ID_FROM_TOKEN_REQUESTED;
            public static final String TOKEN_VERIFICATION_RESPONDED = PAYMENT_SERVICE.HANDLE.GET_CUSTOMER_ID_FROM_TOKEN_RESPONDED;
            public static final String TOKEN_CREATION_REQUESTED = "TokenCreationRequested";


            public static final String ACCOUNT_VERIFICATION_RESPONDED= ACCOUNT_SERVICE.PUBLISH.ACCOUNT_VERIFICATION_RESPONDED;
            public static final String ACCOUNT_VERIFICATION_REQUESTED= ACCOUNT_SERVICE.HANDLE.ACCOUNT_VERIFICATION_REQUESTED;


        }

        public static class PUBLISH {
            public static final String TOKEN_CREATION_RESPONDED = "TokenCreationResponded.";
            public static final String TOKEN_STATUS_RESPONDED = "TokenStatusResponded.";
            public static final String CUSTOMER_CREATION_RESPONDED = "CustomerCreationResponded.";
            public static final String MERCHANT_CREATION_RESPONDED = "MerchantCreationResponded.";
            public static final String CUSTOMER_VERIFICATION_RESPONDED = "CustomerVerificationResponded.";
            public static final String MERCHANT_VERIFICATION_RESPONDED = "MerchantVerificationResponded.";
            public static final String MERCHANT_TO_ACCOUNT_NUMBER_RESPONDED = PAYMENT_SERVICE.HANDLE.MERCHANT_TO_ACCOUNT_NUMBER_RESPONDED;
            public static final String CUSTOMER_TO_ACCOUNT_NUMBER_RESPONDED = PAYMENT_SERVICE.HANDLE.CUSTOMER_TO_ACCOUNT_NUMBER_RESPONDED;
            public static final String CUSTOMER_RESPONDED = "CustomerResponded.";
            public static final String MERCHANT_RESPONDED = "MerchantResponded.";


        }
        public static class ERROR_STRINGS{

            public static final String AN_ERROR_HAS_OCCURRED_COULD_NOT_CREATE_MERCHANT = "AN ERROR HAS OCCURRED - COULD NOT CREATE MERCHANT";
            public static final String AN_ERROR_HAS_OCCURRED_COULD_NOT_CREATE_CUSTOMER = "AN ERROR HAS OCCURRED - COULD NOT CREATE CUSTOMER";

            public static final String NO_MERCHANT_EXISTS_WITH_THE_PROVIDED_ID = "No merchant exists with the provided id";
            public static final String NO_CUSTOMER_EXISTS_WITH_THE_PROVIDED_ID = "No customer exists with the provided id";

        }
    }

    public static class PAYMENT_SERVICE{

        public static class OK_STRINGS{
            public static final String SANITY_CHECK = "Sanity check for payment service";
        }


        public static class HANDLE {

            public static final String PAYMENT_STATUS_REQUESTED = "PaymentStatusRequested";
            public static final String PAYMENT_REQUESTED = "PaymentRequested";

            public static final String MERCHANT_TO_ACCOUNT_NUMBER_RESPONDED = "MerchantIdToAccountNumberResponded.";
            public static final String GET_CUSTOMER_ID_FROM_TOKEN_RESPONDED = "GetCustomerIdFromTokenResponded.";
            public static final String CUSTOMER_TO_ACCOUNT_NUMBER_RESPONDED = "CustomerIdToAccountNumberResponded.";
        }

        public static class PUBLISH {
            public static final String PAYMENT_STATUS_RESPONDED = "PaymentStatusResponded.";

            public static final String MERCHANT_ID_TO_ACCOUNT_NUMBER_REQUESTED = "MerchantIdToAccountNumberRequested";
            public static final String GET_CUSTOMER_ID_FROM_TOKEN_REQUESTED = "GetCustomerIdFromTokenRequested";
            public static final String CUSTOMER_ID_TO_ACCOUNT_NUMBER_REQUESTED = "CustomerIdToAccountNumberRequested";
            public static final String PAYMENT_RESPONDED = "PaymentResponded.";
        }



        public static class ERROR_STRINGS{
            public static final String DEBTOR_ID_MUST_NOT_BE_NULL= "debtor Id must not be null";
            public static final String CREDITOR_ID_MUST_NOT_BE_NULL= "creditor Id must not be null";
            public static final String AMOUNT_MUST_NOT_BE_NULL= "Amount must not be null";
            public static final String AMOUNT_MUST_BE_A_POSITIVE_NUMBER= "Amount must be a positive number";
            public static final String AMOUNT_MUST_BE_A_NUMBER= "Amount must be a number";
            public static final String TOKEN_MUST_NOT_BE_NULL= "Token must not be null";

            public static final String CREDITOR_ACCOUNT_IS_NOT_VALID= "Creditor account is not valid";
            public static final String DEBTOR_ACCOUNT_IS_NOT_VALID= "Debtor account is not valid";
            public static final String TOKEN_ID_MUST_BE_VALID= "Token must be valid";
            public static final String INSUFFICIENT_BALANCE_ON_DEBTOR_ACCOUNT= "Insufficient balance on debtor account";

        }

    }

    public static class REPORT_SERVICE{

        public static class OK_STRINGS{
            public static final String SANITY_CHECK = "Sanity check for report service";
        }


        public static class HANDLE {
            public static final String REST_STATUS_REQUESTED = "ReportStatusRequested";
            public static final String REPORT_CUSTOMER_REQUESTED = "ReportCustomerRequested";
            public static final String REPORT_MERCHANT_REQUESTED = "ReportMerchantRequested";
            public static final String REPORT_MANAGER_REQUESTED = "ReportManagerRequested";
            public static final String LOG_PAYMENT_REQUESTED = "LogPaymentRequested";

        }


        public static class PUBLISH {

            public static final String REPORT_CUSTOMER_RESPONDED = "ReportCustomerResponded.";
            public static final String REPORT_MERCHANT_RESPONDED = "ReportMerchantResponded.";
            public static final String REPORT_MANAGER_RESPONDED = "ReportManagerResponded.";
        }


        public static class ERROR_STRINGS{
            public static final String NO_LOGGED_PAYMENTS_FOR_USER_X = "There are no logged payments for user: ";
        }

    }

    public static class ACCOUNT_SERVICE{

        public static class OK_STRINGS{
            public static final String SANITY_CHECK = "Sanity check for account service";
        }


        public static class HANDLE {
            //Handlers installed in service

            public static final String ACCOUNT_STATUS_REQUESTED = "AccountStatusRequested";
            public static final String GET_CUSTOMER = "GetCustomer.";
            public static final String GET_MERCHANT = "GetMerchant.";
            public static final String MERCHANT_VERIFICATION_REQUESTED = "MerchantVerificationRequested";
            public static final String CUSTOMER_VERIFICATION_REQUESTED = TOKEN_SERVICE.HANDLE.CUSTOMER_VERIFICATION_REQUESTED;
            public static final String CUSTOMER_CREATION_REQUESTED = "CustomerCreationRequested";
            public static final String MERCHANT_CREATION_REQUESTED = "MerchantCreationRequested";

            public static final String MERCHANT_ID_TO_ACCOUNT_NUMBER_REQUESTED = PAYMENT_SERVICE.PUBLISH.MERCHANT_ID_TO_ACCOUNT_NUMBER_REQUESTED;
            public static final String CUSTOMER_ID_TO_ACCOUNT_NUMBER_REQUESTED = PAYMENT_SERVICE.PUBLISH.CUSTOMER_ID_TO_ACCOUNT_NUMBER_REQUESTED;

            public static final String ACCOUNT_VERIFICATION_REQUESTED= "AccountVerificationRequest.";


        }

        public static class PUBLISH {
            public static final String CUSTOMER_CREATION_RESPONDED = TOKEN_SERVICE.PUBLISH.CUSTOMER_CREATION_RESPONDED;
            public static final String CUSTOMER_VERIFICATION_RESPONDED = TOKEN_SERVICE.PUBLISH.CUSTOMER_VERIFICATION_RESPONDED;

            public static final String MERCHANT_VERIFICATION_RESPONDED = TOKEN_SERVICE.PUBLISH.MERCHANT_VERIFICATION_RESPONDED;
            public static final String MERCHANT_CREATION_RESPONDED = TOKEN_SERVICE.PUBLISH.MERCHANT_CREATION_RESPONDED;

            public static final String CUSTOMER_RESPONDED = TOKEN_SERVICE.PUBLISH.CUSTOMER_RESPONDED;
            public static final String MERCHANT_RESPONDED = TOKEN_SERVICE.PUBLISH.MERCHANT_RESPONDED;

            public static final String ACCOUNT_STATUS_RESPONDED = "AccountStatusRequested";
            public static final String ACCOUNT_VERIFICATION_RESPONDED= "AccountVerificationResponded.";
            public static final String CUSTOMER_TO_ACCOUNT_NUMBER_RESPONDED = PAYMENT_SERVICE.HANDLE.CUSTOMER_TO_ACCOUNT_NUMBER_RESPONDED;
            public static final String MERCHANT_TO_ACCOUNT_NUMBER_RESPONDED = PAYMENT_SERVICE.HANDLE.MERCHANT_TO_ACCOUNT_NUMBER_RESPONDED;



        }


        public static class ERROR_STRINGS{
            public static final String AN_ERROR_HAS_OCCURRED_COULD_NOT_CREATE_MERCHANT = TOKEN_SERVICE.ERROR_STRINGS.AN_ERROR_HAS_OCCURRED_COULD_NOT_CREATE_MERCHANT;
            public static final String AN_ERROR_HAS_OCCURRED_COULD_NOT_CREATE_CUSTOMER = TOKEN_SERVICE.ERROR_STRINGS.AN_ERROR_HAS_OCCURRED_COULD_NOT_CREATE_CUSTOMER;
            public static final String NO_MERCHANT_EXISTS_WITH_THE_PROVIDED_ID= TOKEN_SERVICE.ERROR_STRINGS.NO_MERCHANT_EXISTS_WITH_THE_PROVIDED_ID;
            public static final String NO_CUSTOMER_EXISTS_WITH_THE_PROVIDED_ID=TOKEN_SERVICE.ERROR_STRINGS.NO_CUSTOMER_EXISTS_WITH_THE_PROVIDED_ID;

        }

    }
    public static class REST_SERVICE{

        public static class OK_STRINGS{
            public static final String SANITY_CHECK = "Sanity check for REST service";

        }

        public static class PUBLISH {
            public static final String CUSTOMER_CREATION_REQUESTED = ACCOUNT_SERVICE.HANDLE.CUSTOMER_CREATION_REQUESTED;
            public static final String TOKEN_CREATION_REQUESTED = TOKEN_SERVICE.HANDLE.TOKEN_CREATION_REQUESTED;
            public static final String REPORT_MERCHANT_REQUESTED = REPORT_SERVICE.HANDLE.REPORT_MERCHANT_REQUESTED;
            public static final String PAYMENT_REQUESTED = PAYMENT_SERVICE.HANDLE.PAYMENT_REQUESTED;

        }

        public static class HANDLE {
            public static final String TOKEN_CREATION_RESPONDED = TOKEN_SERVICE.PUBLISH.TOKEN_CREATION_RESPONDED;
            public static final String CUSTOMER_CREATION_RESPONDED = ACCOUNT_SERVICE.PUBLISH.CUSTOMER_CREATION_RESPONDED;
            public static final String REPORT_MERCHANT_RESPONDED = REPORT_SERVICE.PUBLISH.REPORT_MERCHANT_RESPONDED;
            public static final String PAYMENT_RESPONDED = PAYMENT_SERVICE.PUBLISH.PAYMENT_RESPONDED;
            public static final String REST_STATUS_REQUESTED = "RestStatusRequested";

        }


    }

}
