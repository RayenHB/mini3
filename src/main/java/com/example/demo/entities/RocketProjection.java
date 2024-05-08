package com.example.demo.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomRock", types = { Rocket.class })

public interface RocketProjection {
	public String getNomRocket();

}
