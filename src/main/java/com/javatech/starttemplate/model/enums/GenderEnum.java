package com.javatech.starttemplate.model.enums;

import lombok.Getter;

public enum GenderEnum {

  M("Masculino"),
  F("Feminino"),
  I("Indefinido");

  @Getter
  private String valor;

  GenderEnum(String valor) {
    this.valor = valor;
  }

}
