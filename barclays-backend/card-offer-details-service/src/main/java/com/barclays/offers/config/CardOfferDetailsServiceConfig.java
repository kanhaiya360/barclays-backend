package com.barclays.offers.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CardOfferDetailsServiceConfig {

	@Bean RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
