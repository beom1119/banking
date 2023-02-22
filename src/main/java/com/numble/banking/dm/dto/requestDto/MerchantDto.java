package com.numble.banking.dm.dto.requestDto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class MerchantDto {

    @JsonProperty("merchant_id")
    private String merchantId;

    @JsonProperty("device_fingerprint_id")
    private String deviceFingerPrintId;

    protected MerchantDto()
    {

    }

    @Builder
    public MerchantDto(String merchantId, String deviceFingerPrintId) {
        this.merchantId = merchantId;
        this.deviceFingerPrintId = deviceFingerPrintId;
    }
}
