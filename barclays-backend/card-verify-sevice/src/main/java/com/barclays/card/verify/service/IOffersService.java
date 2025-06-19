package com.barclays.card.verify.service;

import com.barclays.card.verify.model.OffersRequest;
import com.barclays.card.verify.model.OffersResponse;

public interface IOffersService {
	OffersResponse getOffers(OffersRequest offersRequest) ;
}
