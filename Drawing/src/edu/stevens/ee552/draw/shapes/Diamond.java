package edu.stevens.ee552.draw.shapes;

import java.awt.Graphics;


public class Diamond extends Shape{
	
	int x, y;
	int dx1, dy1;
	int dx2, dy2;
	int dx3, dy3;
	int dx4, dy4;
	
	public Diamond(int x1,int x2,int y1,int y2){
		super(x1,y1,x2,y2);
		
		dx1 = (x1+x2)/2;
		dy1 = y1;
		
		dx2 = x2;
		dy2 = (y1+y2)/2;
		
		dx3 = (x1+x2)/2;
		dy3 = y2;
		
		dx4 = x1;
		dy4 = (y1+y2)/2;
		
	}
	
	public void draw(Graphics g){
		
		/*g.drawLine(x1, y1, (x1+x2)/2, y1);
		g.drawLine((x1+x2)/2, y1, x2, (y1+y2)/2);
		g.drawLine(x2, (y1+y2)/2, (x1+x2)/2, y2);
		g.drawLine((x1+x2)/2, y2, x1, (y1+y2)/2);
		g.drawLine(x1, (y1+y2)/2, (x1+x2)/2, y1);
		*/
		g.drawLine(dx1, dy1, dx2, dy2);
		g.drawLine(dx2, dy2, dx3, dy3);
		g.drawLine(dx3, dy3, dx4, dy4);
		g.drawLine(dx4, dy4, dx1, dy1);
		
	}
	


	public boolean isClicked(int x, int y) {
		// TODO Auto-generated method stub
		//double value = (x1 - x0)(y2 - y0) - (x2 - x0)(y1 - y0);
		int value = ((dx2-dx1)*(y-dy1))-((x-dx1)*(dy2-dy1));
		int value2 = ((dx3-dx2)*(y-dy2))-((x-dx2)*(dy3-dy2));
		int value3 = ((dx4-dx3)*(y-dy3))-((x-dx3)*(dy4-dy3));
		int value4 = ((dx1-dx4)*(y-dy4))-((x-dx4)*(dy1-dy4));
		
		if(value <= 0 && value2 <= 0 && value3 <= 0 && value4 <= 0){
		return true;
		}else{
			return false;
		}
	}

}
