package com.rs.springframework.service.configuration;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by E076103 on 04-10-2018.
 */
@Configuration
public class AppConfiguration {


  // Create a bean for restTemplate to call services
    @Bean
    @LoadBalanced    // Load balance between service instances running at different ports.
    public RestTemplate restTemplate() {
      return new RestTemplate();
    }

}
