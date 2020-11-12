package com.javatech.starttemplate.model;

import com.javatech.starttemplate.model.enums.GenderEnum;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "pessoa", schema = "public")
@Data
public class Person implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_pessoa", nullable = false)
  private Long id;

  @Column(name = "nm_pessoa", length = 256, nullable = false)
  private String nome;

  @Column(name = "nr_documento", length = 15)
  private String documento;

  @Column(name = "dt_nascimento", nullable = false)
  private LocalDateTime nascimento;

  @Enumerated(EnumType.STRING)
  @Column(name = "in_sexo", length = 1, nullable = false)
  private GenderEnum sexo;

  @Column(name = "ds_email", length = 150)
  private String email;

  @Column(name = "in_ativo", nullable = false)
  private Integer ativo;

}
