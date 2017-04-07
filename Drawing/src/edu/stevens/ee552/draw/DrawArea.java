package edu.stevens.ee552.draw;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawArea extends JPanel {
	private int x1, y1, x2,y2, lastx, lasty;
	private DrawMode mode;
	
	public void setMode(DrawMode m) {}
//	private ArrayList<Shape> shapes;
	
	public DrawArea() {
		setBackground(Color.RED);
		addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
				x1 = e.getX(); y1 = e.getY();
				lastx = x1; lasty = y1;
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				x2 = e.getX(); y2 = e.getY();
				Graphics g = getGraphics();
				g.drawLine(x1, y1, x2, y2);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				DrawingArea.this.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			
		});
		addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getX(), y = e.getY();
				Graphics g = getGraphics();
				g.setXORMode(Color.WHITE);
				g.drawLine(x1, y1, lastx, lasty);				
				g.drawLine(x1, y1, x, y);
				lastx = x; lasty = y;
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				
			}
			
		});
		
		
	}
	//public void paint(Graphics g) {
		
		
		
	//}
	public void add(Shape s) {
//		shapes.add(s);
	}
	public void delete(Shape s) {
		
	}
//	public Shape pickShape(int x, int y) {
		
//	}
//	public void createShape(int x1, int y1, int x2, int y2) {
//		add(mode.createShape(x1,y1,x2,y2));
//	}


}
