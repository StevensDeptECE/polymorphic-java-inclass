package edu.stevens.ee552.draw.shapes;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {


	protected Color filledColor;
	protected Color edgeColor;
	protected int x1,y1,x2,y2;
	protected Shape(int x1,int x2,int y1,int y2,Color edgeColor,Color filledColor){
		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;
		this.edgeColor=edgeColor;
		this.filledColor=filledColor;
	}
	protected Shape(int x1,int x2,int y1,int y2){
		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;
	}
	public abstract void draw(Graphics g);
	
	public abstract boolean isClicked(int x, int y);
}
