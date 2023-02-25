package com.numble.dmplus.dm.controller;

import com.numble.dmplus.dm.dto.responseDto.Payment;
import org.apache.tomcat.util.http.fileupload.MultipartStream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;


@SpringBootTest
class DmControllerTest {


    @Autowired
    MockMvc mockMvc;

@Test
@DisplayName("test ")
    void test() throws Exception {
        mockMvc.perform(post("/dm")
                .contentType(MediaType.APPLICATION_JSON)).andExpect(jsonPath("$.payment").value("hello"))
                .andExpect(status.ok)


    }







}