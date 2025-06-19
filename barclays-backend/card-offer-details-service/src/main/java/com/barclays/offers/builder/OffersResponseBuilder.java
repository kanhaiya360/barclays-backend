package com.barclays.offers.builder;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.barclays.offers.dao.OffersDetailsDao;
import com.barclays.offers.model.CardVerifyResposne;
import com.barclays.offers.model.EnrollmentResponse;
import com.barclays.offers.model.OfferDetails;
import com.barclays.offers.model.OffersDaoResponse;
import com.barclays.offers.model.OffersResponse;
@Component
public class OffersResponseBuilder {

	public OffersResponse buildOffersResponse(OffersDaoResponse offersDaoResponse,
			CardVerifyResposne cardVerifyResposne, EnrollmentResponse enrollmentResponse) {
		// TODO Auto-generated method stub
		OffersResponse offersResponse=new OffersResponse();
		List<OfferDetails> details=new ArrayList<>();
		for(OffersDetailsDao detailsDao: offersDaoResponse.getOffersDetailsDaos()) {
			OfferDetails offerDetails=new OfferDetails();
			offerDetails.setName(detailsDao.getName());
			offerDetails.setOfferId(detailsDao.getOfferId());
			offerDetails.setDate(detailsDao.getDate());
			offerDetails.setDesc(detailsDao.getDesc());
			offerDetails.setImageUrl(detailsDao.getImageUrl());
			offerDetails.setStatus(detailsDao.getStatus());
			details.add(offerDetails);
		}
		offersResponse.setOffers(details);
		
		return offersResponse;
	}

}
