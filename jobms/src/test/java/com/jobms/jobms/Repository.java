package com.jobms.jobms;

import com.jobms.jobms.domain.Company;
import com.jobms.jobms.domain.Job;
import com.jobms.jobms.repository.CompanyRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;


@SpringBootTest
public class Repository {

    @Autowired
    CompanyRepository companyRepository;

    @Test
    void createCompany(){
        Job job = new Job();
        job.setTitle("sde");
        Company company = new Company();
        company.setName("Microsoft");
        List<Job> jobs = new ArrayList<>();
        jobs.add(job);
        company.setJobs(jobs);
        companyRepository.save(company);
    }
}
