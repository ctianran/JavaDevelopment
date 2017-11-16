/**
 * Created by Tianran on 10/27/2017.
 */
public class Main {
	public static void main(String[] args) {
		ITelephone timsPhone = new DeskPhone(123456);
		timsPhone.powerOn();
		timsPhone.callPhone(123456);
		timsPhone.answer();

		timsPhone = new MobilePhone(2345);
		timsPhone.powerOn();
		timsPhone.callPhone(2345);
		timsPhone.answer();
	}
}
