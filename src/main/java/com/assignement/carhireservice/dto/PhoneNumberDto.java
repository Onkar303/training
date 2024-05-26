package com.assignement.carhireservice.dto;


import com.assignement.carhireservice.constants.PhoneType;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutablePhoneNumberDto.class)
@JsonDeserialize(as = ImmutablePhoneNumberDto.class)
public interface PhoneNumberDto {

    String getPhoneNumber();

    PhoneType getPhoneType();
}
