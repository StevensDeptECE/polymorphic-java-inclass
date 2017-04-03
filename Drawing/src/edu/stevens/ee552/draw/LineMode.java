package edu.stevens.ee552.draw;

public class LineMode extends DrawMode {
	public Shape createShape(int x1, int y1, int x2, int y2) {
		return new Line(x1,y1,x2,y2);
	}
}
