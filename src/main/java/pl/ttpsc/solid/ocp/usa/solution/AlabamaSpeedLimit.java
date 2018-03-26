package pl.ttpsc.solid.ocp.usa.solution;

public class AlabamaSpeedLimit implements IStateOfAmericaSpeedLimit
{
    static double MAX_SPEED = 0.0;
    static double EXCEED_BY_FIVE_MULTIPLIER = 1.5;

    @Override
    public double calculateFine(double speed) {
        double fine = 0.0;
        if (speed > MAX_SPEED) {
            // calculate...
        }
        return fine;
    }
}
