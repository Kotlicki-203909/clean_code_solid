package pl.ttpsc.solid.ocp.usa.solution;

public class SouthCarolinaSpeedLimit implements IStateOfAmericaSpeedLimit
{
    static double MAX_SPEED = 0.0;
    static double EXCEED_BY_TEN_MULTIPLIER = 2.0;

    @Override
    public double calculateFine(double speed) {
        double fine = 0.0;
        if (speed > MAX_SPEED) {
            // calculate...
        }
        return fine;
    }
}
