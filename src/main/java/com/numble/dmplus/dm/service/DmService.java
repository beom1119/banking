package com.numble.dmplus.dm.service;


import com.numble.dmplus.dm.dto.responseDto.DmApiResDto;
import com.numble.dmplus.dm.vo.DmInformationVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class DmService {

    public DmApiResDto api()
    {
        DmInformationVo dmInformationVo = new DmInformationVo();
        log.info(dmInformationVo.toString());
        DmApiResDto dto = new DmApiResDto();
        return dto;
    }

}
