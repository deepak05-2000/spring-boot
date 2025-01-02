package com.concepts.ms.config;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DbCred {

    private static final Logger log = LoggerFactory.getLogger(DbCred.class);
    @Value("${username}")
    private String username;

    @Value("${password}")
    private String password;

    @Value("${application.name}")
    private String applicationName;

    @PostConstruct
    public void postConstruct() {
        log.debug("username {}", username);
        log.debug("password {}", password);
        log.debug("applicationName {}", applicationName);
    }
}
