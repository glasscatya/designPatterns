package observerPattern;

public class ForecastDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherDate weatherDate;

    public ForecastDisplay(WeatherDate weatherDate) {
        this.weatherDate = weatherDate;
        weatherDate.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("===============================");
        System.out.println("|                             |");
        System.out.println("|   Weather Station Display   |");
        System.out.println("|                             |");
        System.out.println("===============================");
        System.out.println("| Temperature: " + temperature + " °C  |");
        System.out.println("| Humidity:    " + humidity + " %   |");
        System.out.println("| Pressure:    " + pressure + " hPa |");
        System.out.println("===============================");
    }

    @Override
    public void update() {
        temperature = weatherDate.getTemperature();
        humidity = weatherDate.getHumidity();
        pressure = weatherDate.getPressure();
        display();
    }
}
