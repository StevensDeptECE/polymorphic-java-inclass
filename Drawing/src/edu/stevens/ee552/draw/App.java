package edu.stevens.ee552.draw;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class App extends JFrame {
	String title; 
	int w; int h; 
	String[][] menus; 
	Color bgColor;
	private HashMap<String, ActionListener> actionMap;
	
	
	//public App(String title, int w, int h, Color bgColor , String[][] menus ) {
	public App(String title, int w, int h, Color bgColor ) {
		//this.title=title;
		super(title);
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.w=w; this.h=h;
		//this.setSize(w,h);
	    //Container c = getContentPane();
	    this.bgColor=bgColor;
	    //c.setBackground(bgColor);
	    //JPanel p = new JPanel();
	    //p.setBackground(Color.black);
	    //p.setLayout(new GridLayout(1,4));
	    //for (int i-0;i<4;i++){
	    //	JButton b = new JButton();
	    //}
		//make the file menu etc
		//setVisible(True);
	    make_it();
	}
	//Constructor to read form a file and make the environment
	/*
	public App(String confFile) {
		FileReader f = new FileReader(confFile);
		String line;
		while(line = f.readLine()){
			String[] words = line.split("\\s+"); //takes out the problem of extra spaces
			if (words[0]=="TITLE")
				this.title=words[1];
			else if (words[0]=="HEIGHT")
				this.h=valueOf(words[1]);
			else if (words[0]=="WIDTH")
				this.w=valueOf(words[1]);
			else if (words[0]=="bgColor")
				this.bgColor = (Color)Color.class.getField(words[1]).get(null);
				//this.bgColor=words[1];
			//need to make the menu bar and shape selector bar
			//else if (words[0]=="FILE")
				//Add words[1]=hashmap
			//else if (words[0]=="EDIT")
				//Add words[1]=hashmap

		}
		make_it();
	}   */
	
	private void make_it(){
		//Makes the window as per the specifications given
		//super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setSize(w,h);
	    Container c = getContentPane();
	    c.setBackground(bgColor);

	    JPanel p = new JPanel();
	    p.setBackground(Color.BLUE);
	    p.setLayout(new GridLayout(1,4));
//	    for (int i=0;i<4;i++){
//	    	JButton b = new JButton();
//	    }
	    JButton b = new JButton("test button");
	    JLabel l = new JLabel("test label");
	    p.add(b);
	    p.add(l);
	    this.add(p);
		//make the file menu etc
		setVisible(true);
	}
	
	public static void main(String[] args){
		new App("Test title", 500, 700, Color.RED);
	}
}
