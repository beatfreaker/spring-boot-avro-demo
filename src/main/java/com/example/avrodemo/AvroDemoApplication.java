package com.example.avrodemo;

import com.fasterxml.jackson.databind.MapperFeature;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

@SpringBootApplication
public class AvroDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AvroDemoApplication.class, args);
	}

	@Bean
	public Jackson2ObjectMapperBuilder objectMapperBuilder() {
		Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
		builder.featuresToEnable(MapperFeature.REQUIRE_SETTERS_FOR_GETTERS);
		return builder;
	}

}
