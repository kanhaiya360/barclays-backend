package com.barclays.offers.enrollment.svcclient;

import org.springframework.stereotype.Service;

import com.barclays.offers.model.EnrollmentRequest;
import com.barclays.offers.model.EnrollmentResponse;

@Service
public class EnrollmentServiceClientImpl implements IEnrollmentServiceClient{

	@Override
	public EnrollmentResponse enrollment(EnrollmentRequest enrollmentRequest) {
		
		return null;
	}

}
