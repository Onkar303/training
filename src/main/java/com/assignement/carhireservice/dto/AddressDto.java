package com.assignement.carhireservice.dto;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableAddressDto.class)
@JsonDeserialize(as =  ImmutableAddressDto.class)
public interface AddressDto {

    String getStreetNumber();

    String getStreetName();

    String getStreetType();

    String getSuburb();

    String getState();

    String getPostCode();

}
