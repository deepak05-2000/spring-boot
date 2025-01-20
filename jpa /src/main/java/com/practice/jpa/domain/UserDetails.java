package com.practice.jpa.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class UserDetails implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    private String name;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumns({@JoinColumn(name = "user_address_street", referencedColumnName = "street"), @JoinColumn(name =
            "user_address_pin_code", referencedColumnName = "pincode")})
    @JsonIgnoreProperties(value = {"userDetails"})
    private UserAddress address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserAddress getAddress() {
        return address;
    }

    public void setAddress(UserAddress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserDetails{" + "id=" + id + ", name='" + name + '\'' + ", address=" + address + '}';
    }
}
