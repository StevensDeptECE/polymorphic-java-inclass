package edu.stevens.ee552.draw;
import java.awt.*;
import javax.swing.*;

public class DrawingApp extends JFrame { //extends App {
	public DrawingApp() {
		super("drawing");
		setSize(1000,700);
		Container c = getContentPane();
		c.add(BorderLayout.CENTER, new DrawArea());
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new DrawingApp();
	}

}
