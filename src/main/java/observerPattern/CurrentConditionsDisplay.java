package observerPattern;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherDate weatherDate;

    public CurrentConditionsDisplay(WeatherDate weatherDate) {
        this.weatherDate = weatherDate;
        weatherDate.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("CurrentConditionsDisplay:" +
                "{" + "temperature:" + temperature + "}" + "{" + "humidity:" + humidity + "}");
    }

    @Override
    public void update() {
        this.temperature = weatherDate.getTemperature();
        this.humidity = weatherDate.getHumidity();
        display();
    }
}
