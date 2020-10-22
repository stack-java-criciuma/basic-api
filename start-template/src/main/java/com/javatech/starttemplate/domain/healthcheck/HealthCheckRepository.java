package com.javatech.starttemplate.domain.healthcheck;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

public interface HealthCheckRepository extends CrudRepository<HealthCheckEntity, Integer> {

  @Query(value = "select 1 from health")
  String isHealthly();
}
