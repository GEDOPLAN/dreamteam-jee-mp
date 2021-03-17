package de.gedoplan.javaland.dreamteam.service;

import de.gedoplan.javaland.dreamteam.entity.Planet;
import de.gedoplan.javaland.dreamteam.persistence.PlanetRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class PlanetService {

  @Inject
  PlanetRepository planetRepository;

  public double getGravity(String id1, String id2) {
    Planet planet1 = this.planetRepository.findById(id1);
    Planet planet2 = this.planetRepository.findById(id2);
    double distance = 42_000_000;
    double G = 6.674e-11;
    return G * planet1.getMass() * planet2.getMass() / distance / distance;
  }
}
