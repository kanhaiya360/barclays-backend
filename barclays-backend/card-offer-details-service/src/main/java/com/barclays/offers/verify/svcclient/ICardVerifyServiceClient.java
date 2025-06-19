package com.barclays.offers.verify.svcclient;

import com.barclays.offers.model.CardVerifyRequest;
import com.barclays.offers.model.CardVerifyResposne;

public interface ICardVerifyServiceClient {

	CardVerifyResposne verifyCard(CardVerifyRequest cardVerifyRequest);
}
