package com.barclays.offers.util;

public enum OfferDetailsEnum {

    CLIENT_ID_100("100", "Client Id Invalid", "Data_Error"),
    CHANNEL_ID_101("101", "Client Id ChannelId", "Data_Error"),
    CARD_NUM_102("102", "Card Number Invalid", "Data_Error"),
    NO_OFFERS_FOUND_103("103", "Client Id Invalid", "Data_Error"),
    DB_TIMEOUT_111("111", "DATABASE TIMEOUT", "System_Error"),
    DB_DOWN_112("112", "DATABASE CONNECTION FAILURE", "System_Error"),
    DB_SYNTAX_113("113", "DATABASE SYNTAX ERROR", "System_Error");

    private final String errorCode;
    private final String errorMsg;
    private final String typeOfError;

    OfferDetailsEnum(String errorCode, String errorMsg, String typeOfError) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.typeOfError = typeOfError;
    }

   public static boolean checkErrorCode(String errorCode,  String typeOfError) {
	   return false;
   }
}
