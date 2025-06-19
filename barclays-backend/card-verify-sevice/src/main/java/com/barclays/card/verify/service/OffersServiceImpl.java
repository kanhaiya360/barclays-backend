package com.barclays.card.verify.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barclays.card.verify.builder.OffersRequestBuilder;
import com.barclays.card.verify.builder.OffersResponseBuilder;
import com.barclays.card.verify.dao.IOffersDao;
import com.barclays.card.verify.model.OffersRequest;
import com.barclays.card.verify.model.OffersResponse;

@Service
public class OffersServiceImpl implements IOffersService{

	@Autowired
	IOffersDao offersDao;
	@Autowired
	OffersRequestBuilder offersRequestBuilder;
	@Autowired
	OffersResponseBuilder offersResponseBuilder;

	@Override
	public OffersResponse getOffers(OffersRequest offersRequest) {
		
//		EnrollmentRequest enrollmentRequest=new EnrollmentRequest();
//		EnrollmentResponse enrollmentResponse = enrollmentServiceClient.enrollment(enrollmentRequest);
//		
//		CardVerifyRequest cardVerifyRequest=new CardVerifyRequest();
//		CardVerifyResposne cardVerifyResposne = cardVerifyServiceClient.verifyCard(cardVerifyRequest);
//		
		return null;
	}
}
