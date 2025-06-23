package com.barclays.offers.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.barclays.offers.model.OffersResponse;
import com.barclays.offers.model.StatusBlock;

@RestControllerAdvice
public class OfferDetailsControllerAdvice {

    @ExceptionHandler(value = OffersInvalidRequestDataExceptioon.class)
    public OffersResponse handleInvalidDataException(OffersInvalidRequestDataExceptioon exception) {
        return buildResponse(exception.getRespCode(), exception.getRespMsg());
    }

    @ExceptionHandler(value = SystemException.class)
    public OffersResponse handleSystemException(SystemException exception) {
        return buildResponse(exception.getRespCode(), exception.getRespMsg());
    }

    @ExceptionHandler(value = BusinessException.class)
    public OffersResponse handleBusinessException(BusinessException exception) {
        return buildResponse(exception.getRespCode(), exception.getRespMsg());
    }

    @ExceptionHandler(value = Exception.class)
    public OffersResponse handleUnknownException(Exception exception) {
        return buildResponse("0", "Unknown exception: " + exception.getMessage());
    }

    private OffersResponse buildResponse(String code, String message) {
        OffersResponse response = new OffersResponse();
        StatusBlock statusBlock = new StatusBlock();
        statusBlock.setRespCode(code);
        statusBlock.setRespMsg(message);
        response.setStatusBlock(statusBlock);
        return response;
    }
}
