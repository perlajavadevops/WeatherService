package com.weather.weatherservice.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class Sys {

	private int type;
	private int id;
	private String country;
	private int sunrise;
	private int sunset;
}
