package com.numble.banking.dm.dto.requestDto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class DmApiReqDto {

    @JsonProperty("merchant")
    private MerchantDto merchantDto;

    @JsonProperty("payment")
    private PaymentDto paymentDto;

    @JsonProperty("buyer")
    private BuyerDto buyerDto;

    @JsonProperty("product")
    private ProductDto productDto;

    @JsonProperty("ship_to")
    private ShipToDto shipToDto;

    @JsonProperty("bill_to")
    private BillToDto billToDto;


    protected DmApiReqDto()
    {

    }


    @Builder
    public DmApiReqDto(MerchantDto merchantDto, PaymentDto paymentDto, BuyerDto buyerDto, ProductDto productDto, ShipToDto shipToDto, BillToDto billToDto) {
        this.merchantDto = merchantDto;
        this.paymentDto = paymentDto;
        this.buyerDto = buyerDto;
        this.productDto = productDto;
        this.shipToDto = shipToDto;
        this.billToDto = billToDto;
    }
}
