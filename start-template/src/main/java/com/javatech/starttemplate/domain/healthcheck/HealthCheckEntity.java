package com.javatech.starttemplate.domain.healthcheck;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table(value = "health")
public class HealthCheckEntity {

  @Id
  @Column("id")
  private Integer id;

  public HealthCheckEntity(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }
}
