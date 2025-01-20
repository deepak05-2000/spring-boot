package com.practice.jpa.domain;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UserAddressCK implements Serializable {
    private String street;
    private String pincode;

    public UserAddressCK() {
    }

    public UserAddressCK(String street, String pincode) {
        this.street = street;
        this.pincode = pincode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @Override
    public boolean equals(Object o) {
        if (this==o) return true;
        if (o==null || getClass()!=o.getClass()) return false;
        UserAddressCK that = (UserAddressCK) o;
        return Objects.equals(street, that.street) && Objects.equals(pincode, that.pincode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, pincode);
    }

    @Override
    public String toString() {
        return "UserAddressCK{" + "street='" + street + '\'' + ", pincode='" + pincode + '\'' + '}';
    }
}
