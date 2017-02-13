package com.company;

/**
 * Created by Tianran on 9/30/2016.
 */
public interface ITelephone {
	public void powerOn();
	public void dial(int phoneNumber);
	public void answer();
	public boolean callPhone(int phoneNumber);
	public boolean isRinging();


}
