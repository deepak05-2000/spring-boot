package com.jobms.jobms.service;


import com.jobms.jobms.mapper.JobMapper;
import com.jobms.jobms.repository.JobRepository;
import org.springframework.stereotype.Service;

@Service
public class JobServiceImpl {

    JobRepository jobRepository;
    JobMapper jobMapper;

    public JobServiceImpl(JobRepository jobRepository, JobMapper jobMapper) {
        this.jobRepository = jobRepository;
        this.jobMapper = jobMapper;
    }
}
