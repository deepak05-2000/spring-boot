package com.jobms.jobms.service.mapper;

import com.jobms.jobms.domain.Job;
import com.jobms.jobms.service.dto.JobDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {CompanyMapper.class})
public interface JobMapper {
    @Mapping(source = "company", target = "companyDTO")
    JobDTO toDto(Job job);
    @Mapping(source = "companyDTO", target = "company")
    Job toEntity(JobDTO jobDTO);
}
