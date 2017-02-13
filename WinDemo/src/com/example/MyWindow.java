package com.example;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Tianran on 10/6/2016.
 */
public class MyWindow extends Frame {

	public MyWindow(String title) throws HeadlessException {
		super(title);
		setSize(500, 140);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				System.exit(0);
			}
		});

	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Font sansSerifLarge = new Font("SanSerif", Font.BOLD, 18);
		Font sansSerifSmall = new Font("SanSerif", Font.BOLD, 12);
		g.setFont(sansSerifLarge);
		g.drawString("The Complete Java Developer Course", 60, 60);
		g.setFont(sansSerifSmall);
		g.drawString("by Tim", 60, 100);
	}

}
