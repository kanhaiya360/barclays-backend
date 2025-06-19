package com.barclays.offers.dao;

import com.barclays.offers.model.OffersDaoResponse;
import com.barclays.offers.model.OffersDaoRequest;
public interface IOffersDao {

	OffersDaoResponse getOffers(OffersDaoRequest offersDaoRequest);
}
