package com.jobms.jobms.mapper;

import com.jobms.jobms.domain.Job;
import com.jobms.jobms.dto.JobDTO;
import org.mapstruct.Mapper;

@Mapper
public interface JobMapper {
    Job jobDTOToJob(JobDTO jobDTO);
    JobDTO jobToJobDTO(Job job);
}
