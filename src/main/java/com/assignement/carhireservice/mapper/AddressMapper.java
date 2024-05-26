package com.assignement.carhireservice.mapper;

import com.assignement.carhireservice.dto.AddressDto;
import com.assignement.carhireservice.model.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    Address addressDtoToAddress(AddressDto addressDto);

}
