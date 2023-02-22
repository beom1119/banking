package com.numble.banking.dm.dto.responseDto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.Valid;


@Getter
@AllArgsConstructor
public class Payment {


    @JsonProperty("order_id")
    private String orderId;

    private String currency;

    private String amount;

    @JsonProperty("transaction_id")
    private String transactionId;

    @Valid()
    @JsonProperty("payment_method")
    private String paymentMethod;

    protected Payment()
    {

    }

}
