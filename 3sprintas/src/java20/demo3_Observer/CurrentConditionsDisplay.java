package java20.demo3_Observer;

public class CurrentConditionsDisplay implements Observer {

    private float temperature;
    private float humidity;
    private int pressure;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.printf("Temperatūra %.1f°C, drėgnumas %.1f%%, slėgis %dmm\n", temperature, humidity, pressure);
    }
}
