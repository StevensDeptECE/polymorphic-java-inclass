package edu.stevens.ee552.draw.shapes;

public class Shape {

	public void draw(Graphics g);
	public static Shape createShape(int x1, int y1, int x2, int y2) {
	}
	public abstract boolean isClicked(int x, int y);
}
