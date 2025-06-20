package com.barclays.offers.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.barclays.offers.model.OffersDaoRequest;
import com.barclays.offers.model.OffersDaoResponse;
@Service
public class MOffersDaoImpl implements IOffersDao{

	@Override
	public OffersDaoResponse getOffers(OffersDaoRequest offersDaoRequest) {
	    String dbRespCode = "0";
	    String dbRespMsg = "success";

	    OffersDetailsDao offer1 = new OffersDetailsDao();
	    offer1.setOfferId("101");
	    offer1.setName("Festival Offer");
	    offer1.setImageUrl("http://example.com/festival.jpg");
	    offer1.setDesc("Get 20% off on all items.");
	    offer1.setDate("2025-06-18");
	    offer1.setStatus("active");

	    OffersDetailsDao offer2 = new OffersDetailsDao();
	    offer2.setOfferId("102");
	    offer2.setName("New Year Deal");
	    offer2.setImageUrl("http://example.com/newyear.jpg");
	    offer2.setDesc("Buy one get one free on select products.");
	    offer2.setDate("2025-01-01");
	    offer2.setStatus("active");

	    OffersDetailsDao offer3 = new OffersDetailsDao();
	    offer3.setOfferId("103");
	    offer3.setName("Summer Sale");
	    offer3.setImageUrl("http://example.com/summer.jpg");
	    offer3.setDesc("Flat 50% off on summer wear.");
	    offer3.setDate("2025-05-15");
	    offer3.setStatus("expired");

	    List<OffersDetailsDao> offerList = List.of(offer1, offer2, offer3);

	    OffersDaoResponse response = new OffersDaoResponse();
	    response.setRespCode(dbRespCode);
	    response.setRespMsg(dbRespMsg);
	    response.setOfferDaoList(offerList);

	    return response;
	}

}
