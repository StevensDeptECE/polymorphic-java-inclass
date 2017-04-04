package edu.stevens.ee552.draw.shapes;

import java.awt.Color;
import java.awt.Graphics;

public class FilledRect extends Shape {
	private int width, height;

	public FilledRect(int x1, int x2, int y1, int y2, Color edgeColor, Color filledColor) {
		super(x1, x2, y1, y2, edgeColor, filledColor);
		this.width = x2 - x1;
		this.height = y2 - y1;
	}

	public void draw(Graphics g) {
		g.setColor(edgeColor);
		if (width > 0 && height > 0)
			g.fillRect(x1, y1, width, height);
		if (width < 0 && height > 0)
			g.fillOval(x1 + width, y1, Math.abs(width), height);
		if (width < 0 && height < 0)
			g.fillOval(x1 + width, y1 + height, Math.abs(width), Math.abs(height));
		if (width > 0 && height < 0)
			g.fillOval(x1, y1 + height, width, Math.abs(height));

	}

	@Override
	public boolean isClicked(int x, int y) {
		// TODO Auto-generated method stub

		return false;
	}

}
