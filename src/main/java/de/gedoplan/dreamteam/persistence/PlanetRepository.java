package de.gedoplan.dreamteam.persistence;

import de.gedoplan.dreamteam.entity.Planet;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@ApplicationScoped
public class PlanetRepository {

  @Inject
  // @PersistenceContext
  EntityManager entityManager;

  public List<Planet> findAll() {
    return this.entityManager.createQuery("select x from Planet x", Planet.class).getResultList();
  }

  public Planet findById(String id) {
    return this.entityManager.find(Planet.class, id);
  }
}
