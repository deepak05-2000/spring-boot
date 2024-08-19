package com.jobms.jobms.repository;

import com.jobms.jobms.domain.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}
