package pl.ttpsc.solid.dip.weathertracker.solution;


public class WeatherTracker {
    String currentConditions;
    IDevice phone;
    IDevice emailer;

    public WeatherTracker(IDevice phone, IDevice emailer) {
        this.phone = phone;
        this.emailer = emailer;
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        if (weatherDescription == "rainy") {
            String alert = phone.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
        if (weatherDescription == "sunny") {
            String alert = emailer.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
    }
}
