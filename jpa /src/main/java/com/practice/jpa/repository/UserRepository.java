package com.practice.jpa.repository;

import com.practice.jpa.domain.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDetails, Long> {
}
