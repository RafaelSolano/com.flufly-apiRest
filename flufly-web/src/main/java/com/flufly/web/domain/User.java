package com.flufly.web.domain;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class User {
  private int userId;
  private String identificationDocument;
  private String name;
  private int age;
  private String address;
  private String phoneNumber;
  private String email;
  private LocalDate dateOfBirth;
  private Client client;
  private Employee employee;
}
