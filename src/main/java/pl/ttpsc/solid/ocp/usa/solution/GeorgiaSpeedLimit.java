package pl.ttpsc.solid.ocp.usa.solution;

public class GeorgiaSpeedLimit implements StateOfAmericaSpeedLimit
{
    static double MAX_SPEED = 0.0;

    @Override
    public double calculateFine(double speed) {
        double fine = 0.0;
        if (speed > MAX_SPEED) {
            // calculate...
        }
        return fine;
    }
}
