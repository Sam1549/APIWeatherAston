package org.example;

import java.io.IOException;


public interface WeatherApiClient {
    WeatherData sendGetRequest(String apiUrl) throws IOException;

}
