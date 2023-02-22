package com.numble.banking.dm.dto.responseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class DmApiResDto {

    private String rescode;

    private String resMsg;
    private String resDate;
    private Payment payment;

    public DmApiResDto()
    {

    }

    @Builder
    public DmApiResDto(String rescode, String resMsg, String resDate, Payment payment) {
        this.rescode = rescode;
        this.resMsg = resMsg;
        this.resDate = resDate;
        this.payment = payment;
    }
}
