package org.example;

import com.nimbusds.jose.shaded.gson.annotations.SerializedName;

public class WeatherData {
    private Location location;
    private CurrentWeather current;

    public WeatherData() {
    }

    public Location getLocation() {
        return location;
    }

    public CurrentWeather getCurrent() {
        return current;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setCurrent(CurrentWeather current) {
        this.current = current;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "location=" + location +
                ", current=" + current +
                '}';
    }
}

class Location {
    private String name;
    private String region;
    private String country;
    private double lat;
    private double lon;
    @SerializedName("tz_id")
    private String timeZoneId;
    @SerializedName("localtime_epoch")
    private long localTimeEpoch;
    private String localtime;

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public String getCountry() {
        return country;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public String getTimeZoneId() {
        return timeZoneId;
    }

    public long getLocalTimeEpoch() {
        return localTimeEpoch;
    }

    public String getLocaltime() {
        return localtime;
    }

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", country='" + country + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                ", timeZoneId='" + timeZoneId + '\'' +
                ", localTimeEpoch=" + localTimeEpoch +
                ", localtime='" + localtime + '\'' +
                '}';
    }

}

class CurrentWeather {
    @SerializedName("last_updated_epoch")
    private long lastUpdatedEpoch;
    @SerializedName("last_updated")
    private String lastUpdated;
    @SerializedName("temp_c")
    private double temperatureCelsius;
    @SerializedName("temp_f")
    private double temperatureFahrenheit;
    @SerializedName("is_day")
    private int isDay;
    private Condition condition;
    @SerializedName("wind_mph")
    private double windMph;
    @SerializedName("wind_kph")
    private double windKph;
    @SerializedName("wind_degree")
    private int windDegree;
    @SerializedName("wind_dir")
    private String windDirection;
    @SerializedName("pressure_mb")
    private double pressureMb;
    @SerializedName("pressure_in")
    private double pressureIn;
    @SerializedName("precip_mm")
    private double precipMm;
    @SerializedName("precip_in")
    private double precipIn;
    private int humidity;
    private int cloud;
    @SerializedName("feelslike_c")
    private double feelsLikeCelsius;
    @SerializedName("feelslike_f")
    private double feelsLikeFahrenheit;
    @SerializedName("vis_km")
    private double visibilityKm;
    @SerializedName("vis_miles")
    private double visibilityMiles;
    private double uv;
    @SerializedName("gust_mph")
    private double gustMph;
    @SerializedName("gust_kph")
    private double gustKph;

    public long getLastUpdatedEpoch() {
        return lastUpdatedEpoch;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public double getTemperatureCelsius() {
        return temperatureCelsius;
    }

    public double getTemperatureFahrenheit() {
        return temperatureFahrenheit;
    }

    public int getIsDay() {
        return isDay;
    }

    public Condition getCondition() {
        return condition;
    }

    public double getWindMph() {
        return windMph;
    }

    public double getWindKph() {
        return windKph;
    }

    public int getWindDegree() {
        return windDegree;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public double getPressureMb() {
        return pressureMb;
    }

    public double getPressureIn() {
        return pressureIn;
    }

    public double getPrecipMm() {
        return precipMm;
    }

    public double getPrecipIn() {
        return precipIn;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getCloud() {
        return cloud;
    }

    public double getFeelsLikeCelsius() {
        return feelsLikeCelsius;
    }

    public double getFeelsLikeFahrenheit() {
        return feelsLikeFahrenheit;
    }

    public double getVisibilityKm() {
        return visibilityKm;
    }

    public double getVisibilityMiles() {
        return visibilityMiles;
    }

    public double getUv() {
        return uv;
    }

    public double getGustMph() {
        return gustMph;
    }

    public double getGustKph() {
        return gustKph;
    }

    @Override
    public String toString() {
        return "CurrentWeather{" +
                "lastUpdatedEpoch=" + lastUpdatedEpoch +
                ", lastUpdated='" + lastUpdated + '\'' +
                ", temperatureCelsius=" + temperatureCelsius +
                ", temperatureFahrenheit=" + temperatureFahrenheit +
                ", isDay=" + isDay +
                ", condition=" + condition +
                ", windMph=" + windMph +
                ", windKph=" + windKph +
                ", windDegree=" + windDegree +
                ", windDirection='" + windDirection + '\'' +
                ", pressureMb=" + pressureMb +
                ", pressureIn=" + pressureIn +
                ", precipMm=" + precipMm +
                ", precipIn=" + precipIn +
                ", humidity=" + humidity +
                ", cloud=" + cloud +
                ", feelsLikeCelsius=" + feelsLikeCelsius +
                ", feelsLikeFahrenheit=" + feelsLikeFahrenheit +
                ", visibilityKm=" + visibilityKm +
                ", visibilityMiles=" + visibilityMiles +
                ", uv=" + uv +
                ", gustMph=" + gustMph +
                ", gustKph=" + gustKph +
                '}';
    }

}

class Condition {
    private String text;
    private String icon;
    private int code;

    public String getText() {
        return text;
    }

    public String getIcon() {
        return icon;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "Condition{" +
                "text='" + text + '\'' +
                ", icon='" + icon + '\'' +
                ", code=" + code +
                '}';
    }
}