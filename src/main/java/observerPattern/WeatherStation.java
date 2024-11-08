package observerPattern;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherDate wd = new WeatherDate();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(wd);
        ForecastDisplay forecastDisplay = new ForecastDisplay(wd);
        wd.setMeasurements(100, 20, 1);
    }
}
