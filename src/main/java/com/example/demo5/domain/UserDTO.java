package com.example.demo5.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserDTO {
  private int idx;
  private String mid;
  private String name;
  private int age;
  private String address;

}
