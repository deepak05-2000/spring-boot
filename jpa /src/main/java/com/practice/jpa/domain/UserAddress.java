package com.practice.jpa.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

import java.io.Serializable;

@Entity
public class UserAddress implements Serializable {

    @EmbeddedId
    private UserAddressCK userAddressCK;

    private String city;
    private String state;
    private String country;
    @OneToOne(mappedBy = "address")
    @JsonIgnoreProperties(value = "address")
    private UserDetails userDetails;

    public UserAddress() {
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public UserAddressCK getUserAddressCK() {
        return userAddressCK;
    }

    public void setUserAddressCK(UserAddressCK userAddressCK) {
        this.userAddressCK = userAddressCK;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "UserAddress{" + "userAddressCK=" + userAddressCK + ", city='" + city + '\'' + ", state='" + state + '\'' + ", country='" + country + '\'' + '}';
    }
}
