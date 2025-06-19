package com.barclays.offers.dao;

import lombok.Data;

@Data
public class OffersDetailsDao {
	private String offerId;
	private String name;
	private String imageUrl;
	private String desc;
	private String date;
	private String status;
}
