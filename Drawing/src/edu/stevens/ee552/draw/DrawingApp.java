package edu.stevens.ee552.draw;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.*;


public class DrawingApp extends JFrame implements ActionListener{ //extends App {
	JMenuBar bar = new JMenuBar();
	JMenu File = new JMenu("File");
	JMenuItem Open = new JMenuItem("Open");
	JMenuItem Save = new JMenuItem("Save");
	JMenuItem Quit = new JMenuItem("Quit");
	JButton Line = new JButton("Line");
	JButton Rect = new JButton("Rect");
	JButton fRect = new JButton("filled Rect");
	JButton Ellipse = new JButton("Ellipse");
	JButton fEllipse = new JButton("filled Ellipse");
	public DrawingApp() {
		super("drawing");
		setSize(1000,700);
		setJMenuBar(bar);
		File.add(Open);
		File.add(Save);
		File.add(Quit);
		bar.add(File);
		Open.addActionListener(this);
		Save.addActionListener(this);
		Quit.addActionListener(this);
		Container c = getContentPane();
		c.add(BorderLayout.CENTER, new DrawArea());	
		JPanel panel = new JPanel(new GridLayout(5,1));
		panel.add(Line);
		panel.add(Rect);
		panel.add(fRect);
		panel.add(Ellipse);
		panel.add(fEllipse);
		Line.addActionListener(this);
		Rect.addActionListener(this);
		fRect.addActionListener(this);
		Ellipse.addActionListener(this);
		fEllipse.addActionListener(this);
		c.add("West",panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	

	public static void main(String[] args) {
		new DrawingApp();
	}



	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
