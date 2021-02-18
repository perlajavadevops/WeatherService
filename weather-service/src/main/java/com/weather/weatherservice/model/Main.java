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
public class Main {

	private double temp;
	private int feels_like;
	private double temp_min;
	private double temp_max;
	private int pressure;
	private int humidity;
}
