package com.Lloren.appConfig;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.Lloren.repo")
@EntityScan(basePackages = "com.Lloren.entity")
public class ApplicationConfig {

}
