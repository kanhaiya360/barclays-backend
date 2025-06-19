package com.barclays.offers.builder;

import org.springframework.stereotype.Component;

import com.barclays.offers.model.CardVerifyRequest;
import com.barclays.offers.model.EnrollmentRequest;
import com.barclays.offers.model.OffersDaoRequest;
import com.barclays.offers.model.OffersRequest;
@Component
public class OffersRequestBuilder {

	public EnrollmentRequest buildEnrollmentRequest(OffersRequest offersRequest) {
		EnrollmentRequest enrollmentRequest=new EnrollmentRequest();
		
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
