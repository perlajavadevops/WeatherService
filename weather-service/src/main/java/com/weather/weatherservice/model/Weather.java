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
public class Weather {

	 private int id;
	 private String main;
	 private String description;
	 private String icon;
	
}
