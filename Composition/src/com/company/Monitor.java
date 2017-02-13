package com.company;

/**
 * Created by Tianran on 9/13/2016.
 */
public class Monitor {
	private String model;
	private String manufacturer;
	private int size;
	private Resolution nativeReslution;  //composition

	public Monitor(String model, String manufacturer, int size, Resolution nativeReslution) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.size = size;
		this.nativeReslution = nativeReslution;
	}

	public void drawPixelAt(int x, int y, String color) {
		System.out.println("Drawing pixel at " + x + "," + y + " in color " + color);
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getSize() {
		return size;
	}

	public Resolution getNativeReslution() {
		return nativeReslution;
	}
}
