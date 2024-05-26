package com.assignement.carhireservice.mapper;


import com.assignement.carhireservice.dto.PhoneNumberDto;
import com.assignement.carhireservice.model.PhoneNumber;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PhoneMapper {

    PhoneNumber phoneNumberDtotoPhoneNumber(PhoneNumberDto phoneNumberDto);
}
