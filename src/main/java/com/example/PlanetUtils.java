package com.example;

import java.util.List;
import java.util.stream.Collectors;

public class PlanetUtils {

  public List<Planet> getPlanetsBeginningWithM(List<Planet> planets) {
    return planets.stream()
    		.filter(e -> e.getName().startsWith("M"))
    		.collect(Collectors.toList());
  }

  public List<Planet> getPlanetsWithRings(List<Planet> planets) {
    return planets.stream()
    		.filter(e -> e.getHasRings())
    		.collect(Collectors.toList());
  }

  public List<Planet> getPlanetsWithMoreThanThreeMoons(List<Planet> planets) {
    return planets.stream()
    		.filter(e -> e.getNumberOfMoons() > 3)
    		.collect(Collectors.toList());
  }

  public List<Planet> getPlanetsWithDensityGreaterThanFive(List<Planet> planets) {
	  
    return planets.stream()
    		.filter(e -> e.getDensity() > 5)
    		.collect(Collectors.toList());
  }

}
