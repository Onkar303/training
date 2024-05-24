package com.assignement.carhireservice.model;


import com.assignement.carhireservice.constants.PhoneType;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutablePhoneNumber.class)
@JsonDeserialize(as = ImmutablePhoneNumber.class)
public interface PhoneNumber {

    String getPhoneNumber();

    PhoneType getPhoneType();
}
