package com.javatech.starttemplate.domain.healthcheck;

import org.springframework.stereotype.Service;

@Service
public class HealthCheckService {

  private HealthCheckRepository healthCheckRepository;

  public HealthCheckService(HealthCheckRepository healthCheckRepository) {
    this.healthCheckRepository = healthCheckRepository;
  }

  public String getHealthCheckDataBase() {
    if (healthCheckRepository.isHealthly().equals("1")) {
      return "DataBase is running!";
    } else {
      return "DataBase not is running!";
    }
  }
}
