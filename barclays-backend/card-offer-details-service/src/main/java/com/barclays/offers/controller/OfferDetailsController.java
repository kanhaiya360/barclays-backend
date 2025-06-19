package com.barclays.offers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barclays.offers.model.OffersRequest;
import com.barclays.offers.model.OffersResponse;
import com.barclays.offers.service.IOffersService;
import com.barclays.offers.validator.OfferDetailsValidator;

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
		offersRequest.setCardNum(cardNum);
		offersRequest.setClientId(clientId);
		offersRequest.setChannelId(channelId);
		offersRequest.setMsgTs(msgTs);
		offersRequest.setCorelationId(corelationId);
		offersRequest.setAuthToken(authToken);
		OffersResponse offersResponse = offersService.getOffers(offersRequest);
		
		return offersResponse;
	}
}
