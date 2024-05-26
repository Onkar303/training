package com.assignement.carhireservice.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;
import org.springframework.lang.Nullable;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableCustomerDto.class)
@JsonDeserialize(as = ImmutableCustomerDto.class)
public interface CustomerDto {

    String getFirstName();

    String getLastName();

    String getDob();

    @Nullable
    List<AddressDto> getAddress();

    @Nullable
    List<PhoneNumberDto> getPhoneNumbers();

}
