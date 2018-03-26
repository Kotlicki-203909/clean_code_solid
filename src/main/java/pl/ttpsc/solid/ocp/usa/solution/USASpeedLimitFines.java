package pl.ttpsc.solid.ocp.usa.solution;

public class USASpeedLimitFines {
	public double calcualateSpeedLimitFine(StateOfAmericaSpeedLimit state, int speed) {
		return state.calculateFine(speed);
	}

}
