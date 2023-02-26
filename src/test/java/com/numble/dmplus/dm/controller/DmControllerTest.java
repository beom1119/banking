package com.numble.dmplus.dm.controller;

import com.numble.dmplus.dm.service.DmService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



@SpringBootTest
@AutoConfigureMockMvc
class DmControllerTest {

    @MockBean
    private DmService dmService;

    @Autowired
    private MockMvc mockMvc;

    @BeforeEach
    void clean()
    {
        //repository.deleteAll();
    }

    @Test
    @DisplayName("post method TEST")
    void test() throws Exception {
        String requestJson = "{\"merchant\":{\"merchant_id\":\"3474153615\",\"device_fingerprint_id\":\"1234\"},\"payment\":{\"order_id\":\"test\",\"currency\":\"test\",\"amount\":\"test\",\"token_id\":\"test\"},\"buyer\":{\"name\":\"test\",\"email\":\"test@test.com\",\"phone_number\":\"010-9084-4566\"},\"product\":{\"name\":\"1231231\",\"quantity\":\"123\",\"unit_price\":\"123\"},\"ship_to\":{\"city\":\"test\",\"country\":\"test\",\"first_name\":\"test\",\"last_name\":\"test\",\"phone_number\":\"test\",\"postal_code\":\"test\",\"state\":\"test\",\"street1\":\"test\"},\"bill_to\":{\"city\":\"test\",\"country\":\"test\",\"first_name\":\"test\",\"last_name\":\"test\",\"phone_number\":\"010-9084-4566\",\"postal_code\":\"test\",\"state\":\"test\",\"street1\":\"test\"}}";
        mockMvc.perform(post("/dm")
                .contentType(MediaType.APPLICATION_JSON)
                        .content(requestJson)
                )
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.buyer.name").value("test"));
    }


    @Test
    @DisplayName("post method TEST not validation")
    void test2() throws Exception {
        String requestJson = "{\"merchant\":{\"merchant_id\":\"3474153615\",\"device_fingerprint_id\":\"1234\"},\"payment\":{\"order_id\":\"test\",\"currency\":\"test\",\"amount\":\"test\",\"token_id\":\"test\"},\"buyer\":{\"\":\"test\",\"email\":\"test@test.com\",\"phone_number\":\"010-9084-4566\"},\"product\":{\"name\":\"1231231\",\"quantity\":\"123\",\"unit_price\":\"123\"},\"ship_to\":{\"city\":\"test\",\"country\":\"test\",\"first_name\":\"test\",\"last_name\":\"test\",\"phone_number\":\"test\",\"postal_code\":\"test\",\"state\":\"test\",\"street1\":\"test\"},\"bill_to\":{\"city\":\"test\",\"country\":\"test\",\"first_name\":\"test\",\"last_name\":\"test\",\"phone_number\":\"010-9084-4566\",\"postal_code\":\"test\",\"state\":\"test\",\"street1\":\"test\"}}";
        mockMvc.perform(post("/dm")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(requestJson)
                )
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.code").value("400"));
    }





}