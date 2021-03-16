package de.gedoplan.javaland.dreamteam.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Planet {

  private String id;

  private String name;
  private double mass;

  public Planet(String name, double mass) {
    this.name = name;
    this.mass = mass;
  }

  protected Planet() {
  }
}
