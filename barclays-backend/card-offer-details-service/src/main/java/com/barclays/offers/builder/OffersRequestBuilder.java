package com.barclays.offers.builder;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.barclays.offers.model.CardVerifyRequest;
import com.barclays.offers.model.EnrollmentRequest;
import com.barclays.offers.model.OffersDaoRequest;
import com.barclays.offers.model.OffersRequest;

@Component
public class OffersRequestBuilder {

	private String name="test user";
	public EnrollmentRequest buildEnrollmentRequest(OffersRequest offersRequest) {
		EnrollmentRequest enrollmentRequest=new EnrollmentRequest();
		enrollmentRequest.setCardNum(offersRequest.getCardNum());
		enrollmentRequest.setDate(new Date().toString());
		enrollmentRequest.setName(name);
		return enrollmentRequest;
	}

	public CardVerifyRequest buildCardVerifyRequest(OffersRequest offersRequest) {
		CardVerifyRequest cardVerifyRequest=new CardVerifyRequest();

		return cardVerifyRequest;
	}

	public OffersDaoRequest buildDaoRequest(OffersRequest offersRequest) {
		OffersDaoRequest daoRequest=new OffersDaoRequest();
		
		return daoRequest;
	}

}
