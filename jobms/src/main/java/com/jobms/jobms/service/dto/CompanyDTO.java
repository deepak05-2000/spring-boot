package com.jobms.jobms.service.dto;

import java.util.ArrayList;
import java.util.List;

public class CompanyDTO {

    private Integer id;

    private String name;

    private List<JobDTO> jobDTOS = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<JobDTO> getJobDTOS() {
        return jobDTOS;
    }

    public void setJobDTOS(List<JobDTO> jobDTOS) {
        this.jobDTOS = jobDTOS;
    }




}
