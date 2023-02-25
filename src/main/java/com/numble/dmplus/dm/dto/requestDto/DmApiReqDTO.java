package com.numble.dmplus.dm.dto.requestDto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Getter
@ToString
public class DmApiReqDTO {

    @Valid
    @NotNull(message = "merchant is null")
    @JsonProperty("merchant")
    private MerchantDTO merchantDto;

    @Valid
    @NotNull(message = "payment is null")
    @JsonProperty("payment")
    private PaymentDTO paymentDto;

    @Valid
    @NotNull(message = "buyer is null")
    @JsonProperty("buyer")
    private BuyerDTO buyerDto;

    @Valid
    @NotNull(message = "product is null")
    @JsonProperty("product")
    private ProductDTO productDto;

    @Valid
    @JsonProperty("ship_to")
    private ShipToDTO shipToDto;

    @Valid
    @JsonProperty("bill_to")
    private BillToDTO billToDto;


    @Builder
    public DmApiReqDTO(MerchantDTO merchantDto, PaymentDTO paymentDto, BuyerDTO buyerDto, ProductDTO productDto, ShipToDTO shipToDto, BillToDTO billToDto) {
        this.merchantDto = merchantDto;
        this.paymentDto = paymentDto;
        this.buyerDto = buyerDto;
        this.productDto = productDto;
        this.shipToDto = shipToDto;
        this.billToDto = billToDto;
    }

    /***** MerchantDTO ****/
    @Getter
    @NoArgsConstructor
    @ToString
    public static class MerchantDTO
    {
        @NotBlank(message = "merchantId is Blank")
        @JsonProperty("merchant_id")
        private String merchantId;

        @NotBlank(message= "deviceFingerPrintId is Blank")
        @JsonProperty("device_fingerprint_id")
        private String deviceFingerPrintId;

        @Builder
        public MerchantDTO(String merchantId, String deviceFingerPrintId) {
            this.merchantId = merchantId;
            this.deviceFingerPrintId = deviceFingerPrintId;
        }
    }


    /***** PaymentDTO ****/
    @Getter
    @NoArgsConstructor
    @ToString
    public static class PaymentDTO
    {
        @JsonProperty("order_id")
        @NotBlank(message = "order_id is blank")
        private String orderId;

        @NotBlank(message = "currency is Blank")
        private String currency;

        @NotBlank(message = "amount is Blank")
        private String amount;

        @NotBlank(message = "token_id is Blank")
        @JsonProperty("token_id")
        private String tokenId;

        @Builder
        public PaymentDTO(String orderId, String currency, String amount, String tokenId) {
            this.orderId = orderId;
            this.currency = currency;
            this.amount = amount;
            this.tokenId = tokenId;
        }
    }

    /***** BuyerDTO ****/
    @Getter
    @NoArgsConstructor
    @ToString
    public static class BuyerDTO
    {
        private String name;

        @Email
        private String email;

        @JsonProperty("phone_number")
        private String phoneNumber;


        @Builder
        public BuyerDTO(String name, String email, String phoneNumber) {
            this.name = name;
            this.email = email;
            this.phoneNumber = phoneNumber;
        }

    }

    /***** ProductDTO ****/
    @Getter
    @NoArgsConstructor
    @ToString
    public static class ProductDTO
    {
        @NotBlank(message = "name is blank")
        private String name;

        @NotBlank(message = "quantity is blank")
        private String quantity;

        @NotBlank(message = "unit_price is blank")
        @JsonProperty("unit_price")
        private String unitPrice;

        @Builder
        public ProductDTO(String name, String quantity, String unitPrice) {
            this.name = name;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }

    }

    /***** ShipToDTO ****/
    @Getter
    @NoArgsConstructor
    @ToString
    public static class ShipToDTO
    {
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


        @Builder
        public ShipToDTO(String city, String country, String firstName, String lastName, String phoneNumber, String postalCode, String state, String street1) {
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

    /***** BillToDTO ****/
    @Getter
    @NoArgsConstructor
    @ToString
    public static class BillToDTO{
        private String city;
        private String country;

        @JsonProperty("first_name")
        private String firstName;

        @JsonProperty("last_name")
        private String lastName;


        @JsonProperty("phone_number")
        private String phoneNumber;


        @Builder
        public BillToDTO(String city, String country, String firstName, String lastName, String phoneNumber) {
            this.city = city;
            this.country = country;
            this.firstName = firstName;
            this.lastName = lastName;
            this.phoneNumber = phoneNumber;
        }
    }

}