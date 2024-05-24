package com.assignement.carhireservice.model;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableAddress.class)
@JsonDeserialize(as =  ImmutableAddress.class)
public interface Address {

    String getStreetNumber();

    String getStreetName();

    String getStreetType();

    String getSuburb();

    String getState();

    String getPostCode();

}
