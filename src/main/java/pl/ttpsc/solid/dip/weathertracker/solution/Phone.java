package pl.ttpsc.solid.dip.weathertracker.solution;

public class Phone implements IDevice{
    public String generateWeatherAlert(String weatherConditions) {
        String alert = "It is " + weatherConditions;
        return alert;
    }
}
