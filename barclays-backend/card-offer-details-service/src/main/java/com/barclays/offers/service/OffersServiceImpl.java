package com.barclays.offers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barclays.offers.builder.OffersRequestBuilder;
import com.barclays.offers.builder.OffersResponseBuilder;
import com.barclays.offers.dao.IOffersDao;
import com.barclays.offers.enrollment.svcclient.IEnrollmentServiceClient;
import com.barclays.offers.model.CardVerifyRequest;
import com.barclays.offers.model.CardVerifyResposne;
import com.barclays.offers.model.EnrollmentRequest;
import com.barclays.offers.model.EnrollmentResponse;
import com.barclays.offers.model.OffersDaoRequest;
import com.barclays.offers.model.OffersDaoResponse;
import com.barclays.offers.model.OffersRequest;
import com.barclays.offers.model.OffersResponse;
import com.barclays.offers.verify.svcclient.ICardVerifyServiceClient;

@Service
public class OffersServiceImpl implements IOffersService{
	@Autowired
	IEnrollmentServiceClient enrollmentServiceClient;
	@Autowired
	ICardVerifyServiceClient cardVerifyServiceClient;
	@Autowired
	IOffersDao offersDao;
	@Autowired
	OffersRequestBuilder offersRequestBuilder;
	@Autowired
	OffersResponseBuilder offersResponseBuilder;

	@Override
	public OffersResponse getOffers(OffersRequest offersRequest) {
		EnrollmentRequest enrollmentRequest=offersRequestBuilder.buildEnrollmentRequest(offersRequest);
		EnrollmentResponse enrollmentResponse = enrollmentServiceClient.enrollment(enrollmentRequest);
		
		CardVerifyRequest cardVerifyRequest= offersRequestBuilder.buildCardVerifyRequest(offersRequest);
		CardVerifyResposne cardVerifyResposne = cardVerifyServiceClient.verifyCard(cardVerifyRequest);
		
		
		OffersDaoRequest daoRequest =offersRequestBuilder.buildDaoRequest(offersRequest);
		OffersDaoResponse offersDaoResponse = offersDao.getOffers(daoRequest);
		
		OffersResponse offersResponse=offersResponseBuilder.buildOffersResponse(offersDaoResponse,cardVerifyResposne,enrollmentResponse);
		return offersResponse;
	}
}
