package com.assignement.carhireservice.model;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.UUID;

@Entity
@Table(name="Address")
public class Address {

    @Id
    @GeneratedValue()
    UUID Id;

    @Column(name = "streetNumber")
    String StreetNumber;

    @Column(name = "streetName")
    String StreetName;

    @Column(name = "streetType")
    String StreetType;

    @Column(name = "suburb")
    String Suburb;

    @Column(name = "state")
    String State;

    @Column(name = "postCode")
    String PostCode;

    @Column(name = "timeStamp")
    @Temporal(TemporalType.DATE)
    Date timeStamp;

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public String getStreetNumber() {
        return StreetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        StreetNumber = streetNumber;
    }

    public String getStreetName() {
        return StreetName;
    }

    public void setStreetName(String streetName) {
        StreetName = streetName;
    }

    public String getStreetType() {
        return StreetType;
    }

    public void setStreetType(String streetType) {
        StreetType = streetType;
    }

    public String getSuburb() {
        return Suburb;
    }

    public void setSuburb(String suburb) {
        Suburb = suburb;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getPostCode() {
        return PostCode;
    }

    public void setPostCode(String postCode) {
        PostCode = postCode;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }
}
