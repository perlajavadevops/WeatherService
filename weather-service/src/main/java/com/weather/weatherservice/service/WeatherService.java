package com.weather.weatherservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.weather.weatherservice.model.Root;
import com.weather.weatherservice.model.TempResponse;
import com.weather.weatherservice.model.Weather;

@Service
public class WeatherService {

	 @Value("${api.key}")
	 private String apiKey;
	 
	 @Bean
	 public RestTemplate restTemplate() {
	     return new RestTemplate();
	 }
	
	public TempResponse getWeatherTemperature(String cityName) {
		//http://api.openweathermap.org/data/2.5/weather?q=London&appid=ba2e26157dd2d87c9ac4ff1a959d8e8c
		
		String weatherURI = "http://api.openweathermap.org/data/2.5/weather?q="+cityName+"&appid="+apiKey;
		 
		//restTemplate.getForEntity(weatherURI, responseType);
		Root root = restTemplate().getForObject(weatherURI, Root.class);
		System.out.println("============================================");
		System.out.println(root);
		System.out.println("============================================");
		TempResponse tempResponse = new TempResponse();
		tempResponse.setTemp(root.getMain().getTemp());
		//String temp = String.valueOf(root.getMain().getTemp());//return temp as string
		return tempResponse;
		
	}
}
