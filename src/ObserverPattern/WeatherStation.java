package ObserverPattern;

public class WeatherStation {
    public static void main(String[] args) {

        //subject
        WeatherData weatherData = new WeatherData();
        //observer
        new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,56,60.4f);
        weatherData.setMeasurements(12,23,10.4f);
        weatherData.setMeasurements(112,223,130.4f);
    }
}
