/**
 * Created by Tianran on 10/27/2017.
 */
public interface ITelephone {
	public void powerOn();
	public void dial(int phoneNumber);
	public void answer();
	public boolean callPhone(int phoneNumber);
	public boolean isRinging();
}



