package com.assignement.carhireservice.mapper;

import com.assignement.carhireservice.dto.AddressDto;
import com.assignement.carhireservice.model.Address;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    List<Address> addressDtoToAddress(List<AddressDto> addressDto);

}
