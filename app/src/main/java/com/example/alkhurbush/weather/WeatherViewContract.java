package com.example.alkhurbush.weather;


/* Interface which defines what a view to display weather must implement */
public interface WeatherViewContract {

    String TAG = "WeatherView";
    void showErrorAndLastData(String weatherDataString);
    void updateUI(String weatherDataString);
}
