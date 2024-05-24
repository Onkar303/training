package com.assignement.carhireservice.dto;

import com.assignement.carhireservice.constants.PhoneType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.immutables.value.Value;

import java.util.UUID;

@Entity
@Table(name = "PhoneNumber")
@Value.Immutable
public class PhoneNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID Id;

    @Column(name = "phoneNumber")
    String PhoneNumber;

    @Column(name = "phoneType")
    PhoneType PhoneType;

}
