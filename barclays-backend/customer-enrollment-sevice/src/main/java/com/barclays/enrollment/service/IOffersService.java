package com.barclays.enrollment.service;

import com.barclays.enrollment.model.OffersRequest;
import com.barclays.enrollment.model.OffersResponse;

public interface IOffersService {
	OffersResponse getOffers(OffersRequest offersRequest) ;
}
