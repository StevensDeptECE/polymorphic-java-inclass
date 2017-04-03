package edu.stevens.ee552.draw.shapes;

import java.awt.Color;
import java.awt.Graphics;

public class FilledRect extends Shape {

	protected FilledRect(int x1, int x2, int y1, int y2, Color edgeColor, Color filledColor) {
		super(x1, x2, y1, y2, edgeColor, filledColor);
	}

	protected FilledRect(int x1, int x2, int y1, int y2) {
		super(x1, x2, y1, y2);
	}

	public void draw(Graphics g) {
        
		g.fillRect(x1, y1, x2 - x1, y2 - y1);
		
		g.setColor(Color.RED);

	}

	@Override
	public boolean isClicked(int x, int y) {
		// TODO Auto-generated method stub
		
		
		return false;
	}
	

}
