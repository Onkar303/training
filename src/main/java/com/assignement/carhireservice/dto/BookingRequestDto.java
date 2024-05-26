package com.assignement.carhireservice.dto;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.UUID;

@Value.Immutable
@JsonDeserialize(as = ImmutableBookingRequestDto.class)
public interface BookingRequestDto {

    UUID getCustomerId();

    UUID getCarId();

    String getStartBookingDate();

    String getEndBookingDate();
}
