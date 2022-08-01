package awtDemo;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class My_App_Canvas extends Canvas {
	public My_App_Canvas() {
		setBackground(Color.GRAY);
		setSize(300,200);
		
	}
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.fillOval(75, 75, 150, 75);
	}

}
