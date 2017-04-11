package edu.stevens.ee552.draw;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class App extends JFrame {
	String title; 
	int w; int h; 
	String[][] menus; 
	Color bgColor;
	private HashMap<String, ActionListener> actionMap;
	public App(String title, int w, int h, String[][] menus, Color bgColor) {
	
		this.title=title;
		//super(title);
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
	public App(String confFile) {
		FileReader f = new FileReader(configfile);
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
				this.bgColor=words[1];
			//need to make the menu bar and shape selector bar
			//else if (words[0]=="FILE")
				//Add words[1]=hashmap
			//else if (words[0]=="EDIT")
				//Add words[1]=hashmap

		}
		make_it();
	}
	
	private void make_it(){
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setSize(w,h);
	    Container c = getContentPane();
	    c.setBackground(bgColor);

	    JPanel p = new JPanel();
	    p.setBackground(Color.black);
	    p.setLayout(new GridLayout(1,4));
	    for (int i-0;i<4;i++){
	    	JButton b = new JButton();
	    }
		//make the file menu etc
		setVisible(True);
	}
}
