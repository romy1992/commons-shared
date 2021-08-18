package com.commons.shared.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "USER")
@Getter
@Setter
public class UserEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_SEQUENCE")
  @GenericGenerator(name = "USER_SEQUENCE", strategy = "uuid2")
  @Column(name = "ID_LOCAL", unique = true)
  @Basic(optional = false)
  private UUID idUser;

  @Column(name = "EMAIL", unique = true)
  @Basic(optional = false)
  private String email;

  @Column(name = "USERNAME", unique = true)
  @Basic(optional = false)
  private String username;

  @Column(name = "PASSWORD")
  @Basic(optional = false)
  private String password;

  @Column(name = "IS_LOGGED")
  @Basic(optional = false)
  private boolean isLogged;

  @Column(name = "IS_ADMIN")
  @Basic(optional = false)
  private boolean isAdmin;

  @Column(name = "IS_SUPER_ADMIN")
  @Basic(optional = false)
  private boolean isSuperAdmin;

  @Column(name = "DATE_INSCRIPTION")
  @CreatedDate
  @Basic(optional = false)
  private LocalDateTime dateInscription;

  @Column(name = "IS_ACTIVE")
  @Basic(optional = false)
  private Boolean active;

  @ElementCollection private List<String> roles;

  @Column(name = "EMAIL_ACTIVE")
  private boolean emailActive;

  @Column(name = "TOKEN_EMAIL")
  private String tokenEmail;

  @Column(name = "TOKEN_REFRESH_PWD")
  private UUID tokenRefreshPwd;
}
