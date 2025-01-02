package com.jobms.jobms.rest;

import com.jobms.jobms.service.CompanyServiceImpl;
import com.jobms.jobms.service.dto.CompanyDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CompanyResource {

    private final CompanyServiceImpl companyService;

    public CompanyResource(CompanyServiceImpl companyService) {
        this.companyService = companyService;
    }

    @PostMapping("/companies")
    public ResponseEntity<CompanyDTO> addCompany(@RequestBody CompanyDTO companyDTO) throws URISyntaxException {
        return ResponseEntity.created(new URI("/api/company")).body(companyService.createCompany(companyDTO));
    }

    @GetMapping("/companies")
    public ResponseEntity<List<CompanyDTO>> getAllCompanies() {
        return ResponseEntity.ok(companyService.getAllCompanies());
    }
}
