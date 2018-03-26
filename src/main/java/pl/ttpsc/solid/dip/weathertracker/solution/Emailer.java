package pl.ttpsc.solid.dip.weathertracker.solution;


public class Emailer implements IDevice{
    public String generateWeatherAlert(String weatherConditions) {
        String alert = "It is " + weatherConditions;
        return alert;
    }
}
