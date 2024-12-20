package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;

@Data
public class AutoFill {
    private String phoneNumber;
    private String email;
    private String firstName;
    private String lastName;
    private String address;
    private String zipCode;
    private String unit;
    private String city;
    private String state;
    private String country;

    @JsonProperty("PhoneNumber")
    public String getPhoneNumber() { return phoneNumber; }
    @JsonProperty("PhoneNumber")
    public void setPhoneNumber(String value) { this.phoneNumber = value; }

    @JsonProperty("Email")
    public String getEmail() { return email; }
    @JsonProperty("Email")
    public void setEmail(String value) { this.email = value; }

    @JsonProperty("FirstName")
    public String getFirstName() { return firstName; }
    @JsonProperty("FirstName")
    public void setFirstName(String value) { this.firstName = value; }

    @JsonProperty("LastName")
    public String getLastName() { return lastName; }
    @JsonProperty("LastName")
    public void setLastName(String value) { this.lastName = value; }

    @JsonProperty("Address")
    public String getAddress() { return address; }
    @JsonProperty("Address")
    public void setAddress(String value) { this.address = value; }

    @JsonProperty("ZipCode")
    public String getZipCode() { return zipCode; }
    @JsonProperty("ZipCode")
    public void setZipCode(String value) { this.zipCode = value; }

    @JsonProperty("Unit")
    public String getUnit() { return unit; }
    @JsonProperty("Unit")
    public void setUnit(String value) { this.unit = value; }

    @JsonProperty("City")
    public String getCity() { return city; }
    @JsonProperty("City")
    public void setCity(String value) { this.city = value; }

    @JsonProperty("State")
    public String getState() { return state; }
    @JsonProperty("State")
    public void setState(String value) { this.state = value; }

    @JsonProperty("Country")
    public String getCountry() { return country; }
    @JsonProperty("Country")
    public void setCountry(String value) { this.country = value; }
}
