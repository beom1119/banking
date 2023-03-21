package com.numble.dmplus.dm.dto.MapperDto;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper //Mapper 인터페이스에 @Mapper 어노테이션을 붙이면 MapStruct가 자동으로 MessageMapper의 구현체를 생성해줍니다.
public interface MessageMapper {
    MessageMapper INSTANCE = Mappers.getMapper(MessageMapper.class);

    ///REQUEST DTO -> MessageBodyDto 매핑
    MessageBodyDto toMessageBodyDto(RequestDto requestDto);




}
