/**
 * Created by Tianran on 10/27/2017.
 */
public class Gearbox {
	private boolean clutchIsIn;

	public void operateClutch(String inOrOut) {
		this.clutchIsIn = inOrOut.equalsIgnoreCase("in");
	}
}
