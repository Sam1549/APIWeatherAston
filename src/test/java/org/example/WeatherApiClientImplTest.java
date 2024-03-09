package org.example;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WeatherApiClientImplTest {
    private static final String API_KEY = "7a4e49129ef74affb8b222755240903";
    private static final String API_URL = "https://api.weatherapi.com/v1/current.json?key=%s&q=%s";
    WeatherApiClientImpl weatherApiClient = new WeatherApiClientImpl();


    @ParameterizedTest
    @ValueSource(strings = {"London", "Moscow", "Samara"})
    void TestWithParametrs(String city) throws IOException {
        WeatherData weatherData = sendGetRequest(String.format(API_URL, API_KEY, city));
        assertEquals(city, weatherData.getLocation().getName());
    }


    @Test
    WeatherData sendGetRequest(String format) throws IOException {
        return weatherApiClient.sendGetRequest(format);
    }
}