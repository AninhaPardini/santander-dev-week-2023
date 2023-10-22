package me.dio.domain.model;

import lombok.Data;

@Data
public class Account {
  private Long id;
  private String number;
  private String agency;
  private double balance;
  private double limit;
}
