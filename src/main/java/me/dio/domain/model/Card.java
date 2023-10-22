package me.dio.domain.model;

import lombok.Data;

@Data
public class Card {
  private Long id;
  private String number;
  private double limit;
}
