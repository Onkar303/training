package com.assignement.carhireservice.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableCustomer.class)
@JsonDeserialize(as = ImmutableCustomer.class)
public interface Customer {

    String getFirstName();

    String getLastName();

    String getDob();

    Address getAddress();

    List<PhoneNumber> getPhoneNumbers();

}
