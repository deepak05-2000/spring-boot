package com.jobms.jobms.service.mapper;

import com.jobms.jobms.domain.Company;
import com.jobms.jobms.service.dto.CompanyDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CompanyMapper {
//    @Mapping(source = "jobs", target = "jobDTOS")
    CompanyDTO toDTO(Company company);
//    @Mapping(source = "jobDTOS", target = "jobs")
    Company toEntity(CompanyDTO companyDTO);
}
