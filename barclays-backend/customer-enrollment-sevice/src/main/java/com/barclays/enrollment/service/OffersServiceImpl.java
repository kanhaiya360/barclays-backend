package com.barclays.enrollment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barclays.enrollment.builder.OffersRequestBuilder;
import com.barclays.enrollment.builder.OffersResponseBuilder;
import com.barclays.enrollment.dao.IOffersDao;
import com.barclays.enrollment.model.OffersRequest;
import com.barclays.enrollment.model.OffersResponse;

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
