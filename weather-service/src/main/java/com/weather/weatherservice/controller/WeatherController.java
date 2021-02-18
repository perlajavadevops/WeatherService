package com.weather.weatherservice.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.weather.weatherservice.model.TempResponse;
import com.weather.weatherservice.service.WeatherService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "WeatherController", description = "REST Apis related to Weather report!!!!")
@RestController
@RequestMapping("/api/v1/weather")
public class WeatherController {

	@Autowired	
	WeatherService weatherService;
	
	@ApiOperation(value = "Get weather temperature", response = Iterable.class, tags = "Weather Service APIS", hidden = false)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Suceess|OK"),
			@ApiResponse(code = 401, message = "not authorized!"), @ApiResponse(code = 403, message = "forbidden!!!"),
			@ApiResponse(code = 404, message = "not found!!!") })
	@GetMapping(value = "/temp", produces = MediaType.APPLICATION_JSON_VALUE)
	public TempResponse getWeatherTemperature(@RequestParam (value ="cityName") @Valid String cityName){
		
		return weatherService.getWeatherTemperature(cityName);
		
	}
}
