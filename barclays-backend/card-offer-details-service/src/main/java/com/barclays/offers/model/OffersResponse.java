package com.barclays.offers.model;

import java.util.List;

import lombok.Data;

@Data
public class OffersResponse {
	
	private List<OfferDetails> offers;
	private StatusBlock statusBlock;
	
}
