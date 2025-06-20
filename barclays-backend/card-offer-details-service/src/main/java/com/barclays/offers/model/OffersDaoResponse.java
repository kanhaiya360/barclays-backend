package com.barclays.offers.model;

import java.util.List;

import com.barclays.offers.dao.OffersDetailsDao;

import lombok.Data;
@Data
public class OffersDaoResponse {
	private String respCode;
	private String respMsg;
	List<OffersDetailsDao>offerDaoList;

}
