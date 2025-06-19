package com.barclays.offers.model;

import lombok.Data;
import lombok.Setter;

@Data


public class OffersRequest {
	
	private String cardNum;
	private String clientId;
	private String channelId;
	private String msgTs;
	private String authToken;
	private String corelationId;
	
}
