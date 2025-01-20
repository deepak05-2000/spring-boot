package com.practice.jpa.repository;

import com.practice.jpa.domain.UserAddress;
import com.practice.jpa.domain.UserAddressCK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAddressRepository extends JpaRepository<UserAddress, UserAddressCK> {}
