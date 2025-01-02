package com.jobms.jobms.service;


import com.jobms.jobms.domain.Job;
import com.jobms.jobms.repository.CompanyRepository;
import com.jobms.jobms.service.dto.JobDTO;
import com.jobms.jobms.service.mapper.JobMapper;
import com.jobms.jobms.repository.JobRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class JobServiceImpl {

    JobRepository jobRepository;
    JobMapper jobMapper;

    public JobServiceImpl(JobRepository jobRepository, JobMapper jobMapper) {
        this.jobRepository = jobRepository;
        this.jobMapper = jobMapper;
    }

    public JobDTO createJob(JobDTO jobDTO) {
        Job job = jobRepository.save(jobMapper.toEntity(jobDTO));
        return jobMapper.toDto(job);
    }

    public List<JobDTO> getAllJobs() {
        List<Job> jobs = jobRepository.findAll();
        return jobs.stream().map(jobMapper::toDto).toList();
    }

}
