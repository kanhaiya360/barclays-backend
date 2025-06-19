package com.barclays.card.verify.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barclays.card.verify.model.OffersRequest;
import com.barclays.card.verify.model.OffersResponse;
import com.barclays.card.verify.service.IOffersService;
import com.barclays.card.verify.validator.OfferDetailsValidator;

@RestController
@RequestMapping("/api/v1")
public class OfferDetailsController {
	@Autowired
	private OfferDetailsValidator offerDetailsValidator;
	@Autowired
	private IOffersService offersService;

	@GetMapping("offers/{cardnumber}")
	OffersResponse getOffers(@PathVariable("cardnumber") String cardNum,
		@RequestHeader(name = "clientId", required=false)	String clientId,
		@RequestHeader(name = "channelId", required=false)	String channelId,
		@RequestHeader(name = "msgTs", required=false)	String msgTs,
		@RequestHeader(name = "corelationId", required=false)	String corelationId,
		@RequestHeader(name = "authToken", required=false)	String authToken) {
		
//	validate OffersRequest 
		OffersRequest offersRequest=new OffersRequest();
		OffersResponse offersResponse = offersService.getOffers(offersRequest);
		
		return offersResponse;
	}
}
