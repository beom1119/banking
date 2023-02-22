package com.numble.banking.dm.dto.requestDto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class BillToDto {

    private String city;

    private String country;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("phone_number")
    private String phoneNumber;

    @JsonProperty("postal_code")
    private String postalCode;

    private String state;

    private String street1;


    protected BillToDto()
    {

    }

    @Builder
    public BillToDto(String city, String country, String firstName, String lastName, String phoneNumber, String postalCode, String state, String street1) {
        this.city = city;
        this.country = country;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.postalCode = postalCode;
        this.state = state;
        this.street1 = street1;
    }

}
