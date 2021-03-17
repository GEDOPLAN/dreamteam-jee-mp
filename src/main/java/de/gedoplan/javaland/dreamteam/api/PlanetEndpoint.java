package de.gedoplan.javaland.dreamteam.api;

import de.gedoplan.javaland.dreamteam.entity.Planet;
import de.gedoplan.javaland.dreamteam.persistence.PlanetRepository;
import de.gedoplan.javaland.dreamteam.service.PlanetService;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@ApplicationScoped
@Path("planet")
@Produces(MediaType.APPLICATION_JSON)
public class PlanetEndpoint {

  @Inject
  PlanetRepository planetRepository;

  @GET
  public List<Planet> get() {
    return this.planetRepository.findAll();
  }

  @Inject
  PlanetService planetService;

  @GET
  @Path("{id1}-{id2}")
  public double getGravity(@PathParam("id1") String id1, @PathParam("id2") String id2) {
    return this.planetService.getGravity(id1, id2);
  }

}
