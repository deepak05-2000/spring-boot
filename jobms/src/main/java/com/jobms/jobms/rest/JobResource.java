package com.jobms.jobms.rest;

import com.jobms.jobms.service.JobServiceImpl;
import com.jobms.jobms.service.dto.JobDTO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class JobResource {

    private final JobServiceImpl jobService;

    public JobResource(JobServiceImpl jobService) {
        this.jobService = jobService;
    }


    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/csrf")
    public CsrfToken csrf(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @PostMapping("/jobs")
    public ResponseEntity<JobDTO> addJob(@RequestBody JobDTO jobDTO) throws URISyntaxException {
        return ResponseEntity.created(new URI("/api/jobs")).body(jobService.createJob(jobDTO));
    }

    @GetMapping("/jobs")
    public ResponseEntity<List<JobDTO>> getAllJobs() {
        return ResponseEntity.ok(jobService.getAllJobs());
    }
}
