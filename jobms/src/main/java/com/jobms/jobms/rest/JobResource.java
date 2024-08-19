package com.jobms.jobms.rest;

import com.jobms.jobms.domain.Job;
import com.jobms.jobms.mapper.JobMapper;
import com.jobms.jobms.repository.JobRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/api")
public class JobResource {

    private JobRepository jobRepository;

//    private JobMapper jobMapper;

//    public JobResource(JobRepository jobRepository, JobMapper jobMapper) {
//        this.jobRepository = jobRepository;
//        this.jobMapper = jobMapper;
//    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/csrf")
    public CsrfToken csrf(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @PostMapping("/jobs")
    public ResponseEntity<Job> createJob(@RequestBody Job job) throws URISyntaxException {
        return ResponseEntity.created(new URI("/api/jobs")).body(job);
    }
}
