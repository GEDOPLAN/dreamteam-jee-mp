package de.gedoplan.dreamteam.api;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("deep-thought")
public class DeepThoughtEndpoint {

  @Inject
  @ConfigProperty(name = "answer")
  int answer;

  @GET
  @Path("answer")
  public int getAnswer() {
    return this.answer;
  }
}
