package com.javatech.starttemplate.api;

import com.javatech.starttemplate.domain.healthcheck.HealthCheckService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/health-check")
public class HealthCheckController {

  private HealthCheckService healthCheckService;

  public HealthCheckController(HealthCheckService healthCheckService) {
    this.healthCheckService = healthCheckService;
  }

  @GetMapping
  public String getHealthCheck() {
    return "Application is running!";
  }

  @GetMapping("/database")
  public String getHealthCheckDataBase() {
    return healthCheckService.getHealthCheckDataBase();
  }
}
