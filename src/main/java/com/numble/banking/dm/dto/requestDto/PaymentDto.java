package com.numble.banking.dm.dto.requestDto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PaymentDto {


    @JsonProperty("order_id")
    private String orderId;

    private String currency;

    private String amount;

    @JsonProperty("token_id")
    private String tokenId;


    protected PaymentDto()
    {

    }

    @Builder
    public PaymentDto(String orderId, String currency, String amount, String tokenId) {
        this.orderId = orderId;
        this.currency = currency;
        this.amount = amount;
        this.tokenId = tokenId;
    }
}
