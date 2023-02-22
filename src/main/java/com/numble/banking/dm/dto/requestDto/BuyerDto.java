package com.numble.banking.dm.dto.requestDto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;


@Getter
@ToString
public class BuyerDto {


    private String name;

    private String quantity;

    @JsonProperty("unit_price")
    private String unitPrice;


    protected BuyerDto()
    {

    }

    @Builder
    public BuyerDto(String name, String quantity, String unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
}
