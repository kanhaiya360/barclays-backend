package com.barclays.offers.validator;

import org.springframework.stereotype.Component;

import com.barclays.offers.exception.OffersInvalidRequestDataExceptioon;
import com.barclays.offers.model.OffersRequest;

@Component
public class OfferDetailsValidator {

	public void validateRequest(OffersRequest offersRequest) {
		  if (isBlank(offersRequest.getCardNum())) {
	            throw new OffersInvalidRequestDataExceptioon("101", "Card number is missing or empty");
	        }
		  else if (isBlank(offersRequest.getClientId())) {
	            throw new OffersInvalidRequestDataExceptioon("102", "Client ID is missing or empty");
	        }
	        else   if (isBlank(offersRequest.getChannelId())) {
	            throw new OffersInvalidRequestDataExceptioon("103", "Channel ID is missing or empty");
	        }
	        else  if (isBlank(offersRequest.getMsgTs())) {
	            throw new OffersInvalidRequestDataExceptioon("104", "Message timestamp is missing or empty");
	        }
	        else  if (isBlank(offersRequest.getCorelationId())) {
	            throw new OffersInvalidRequestDataExceptioon("105", "Correlation ID is missing or empty");
	        }
	        if (isBlank(offersRequest.getAuthToken())) {
	            throw new OffersInvalidRequestDataExceptioon("106", "Auth token is missing or empty");
	        }
	    }

	    private boolean isBlank(String str) {
	        return (str == null || str.trim().isEmpty());
	    }
		
}
