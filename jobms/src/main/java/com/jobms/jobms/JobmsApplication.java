package com.jobms.jobms;

import com.jobms.jobms.domain.Company;
import com.jobms.jobms.domain.Job;
import com.jobms.jobms.repository.CompanyRepository;
import com.jobms.jobms.repository.JobRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class JobmsApplication {

	private static final Logger log = LoggerFactory.getLogger(JobmsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(JobmsApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(CompanyRepository companyRepository, JobRepository jobRepository){
//		return args -> {
//			Job job = new Job();
//			job.setTitle("sde");
//			Company company = new Company();
//			company.setName("Microsoft");
//
//			job.setCompany(company);
//			companyRepository.deleteAll();
//			jobRepository.deleteAll();
//			jobRepository.save(job);
////			log.debug("JOBS {}", jobRepository.findAll().get(0).getCompany().getId());
//		};
//	}
}
