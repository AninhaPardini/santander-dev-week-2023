package me.dio.domain.model;

import java.util.List;

import lombok.Data;

@Data
public class User {
  private Long id;
  private String name;
  private Account account;
  private List<Feature> features;
  private Card card;
  private List<News> news;
}