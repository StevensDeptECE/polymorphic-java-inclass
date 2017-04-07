package edu.stevens.ee552.draw.shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Rect extends Shape {
	private int width,height;
	public Rect(int x1,int y1, int x2,int y2,Color edgeColor){
		
		super(x1, y1, x2, y2, edgeColor,null);
		this.width=x2-x1;
		this.height=y2-y1;
	}
	public void draw(Graphics g) {
		g.setColor(edgeColor);
		if(width>0&&height>0)
			g.drawRect(x1, y1, width, height);
		if(width<0&&height>0)
			g.drawRect(x1+width, y1, Math.abs(width), height);
		if(width<0&&height<0)
			g.drawRect(x1+width, y1+height, Math.abs(width), Math.abs(height));
		if(width>0&&height<0)
			g.drawRect(x1, y1+height, width, Math.abs(height));
	}

	@Override
	public boolean isClicked(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}
}
