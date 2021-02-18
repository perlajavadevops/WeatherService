package com.weather.weatherservice.model;

import java.util.List;

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
public class Root {

	public Coord coord;
	public List<Weather> weather;
	public String base;
	public Main main;
	public int visibility;
	public Wind wind;
	public Rain rain;
	public Clouds clouds;
	public int dt;
	public Sys sys;
	public int timezone;
	public int id;
	public String name;
	public int cod;
}
