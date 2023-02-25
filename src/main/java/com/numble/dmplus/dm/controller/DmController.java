package com.numble.dmplus.dm.controller;


import com.numble.dmplus.dm.dto.requestDto.DmApiReqDTO;
import com.numble.dmplus.dm.service.DmService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DmController {


    private final DmService dmService;

    public DmController(DmService dmService) {
        this.dmService = dmService;
    }

    @GetMapping("/test")
    public String test()
    {
        return "test";
    }


    @PostMapping("/dm")
    public DmApiReqDTO getApi(@Validated @RequestBody DmApiReqDTO dmApiReqDto)
    {
        dmService.api();
        return dmApiReqDto;
    }


    @PostMapping("/dmtest")
    public String getApi()
    {
        dmService.api();
        return "hello";
    }




}
