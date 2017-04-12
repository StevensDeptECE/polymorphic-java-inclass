package edu.stevens.ee552.draw;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.*;

public class DrawingApp extends App { // we need a method to repaint image from DrawArea
	private JMenuBar bar = new JMenuBar();
	private JMenu File = new JMenu("File");
	private File file;
	private JMenuItem Open = new JMenuItem("Open");
	private JMenuItem Save = new JMenuItem("Save");
	private JMenuItem Quit = new JMenuItem("Quit");
	private JButton Line = new JButton("Line");
	private JButton Rect = new JButton("Rect");
	private JButton fRect = new JButton("filled Rect");
	private JButton Ellipse = new JButton("Ellipse");
	private JButton fEllipse = new JButton("filled Ellipse");
	private BufferedImage bufImg=null;

	public DrawingApp() {
		super("drawing",1366,768,Color.WHITE);
		setJMenuBar(bar);
		Container c = getContentPane();
		File.add(Open);
		File.add(Save);
		File.add(Quit);
		bar.add(File);
		c.add(BorderLayout.CENTER, new DrawArea());
		actions();
		JPanel panel = new JPanel(new GridLayout(5, 1));
		panel.add(Line);
		panel.add(Rect);
		panel.add(fRect);
		panel.add(Ellipse);
		panel.add(fEllipse);
		c.add(BorderLayout.WEST, panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void actions() {
		JFileChooser jfc=new JFileChooser(); 
		jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES );  
		Open.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			        jfc.showDialog(new JLabel(), "Ñ¡Ôñ"); 
					if (file==null)
						return;
					else
						file=jfc.getSelectedFile();
					try {
						bufImg = ImageIO.read(file);
					}catch (FileNotFoundException e1) {
						e1.printStackTrace();
					}catch (IOException e1) {
						e1.printStackTrace();
					}
					System.out.println(file);
				}

			
		});
		Save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			   int select = jfc.showSaveDialog(DrawingApp.this);
//             fileChooser.setSelectedFile(new File("new.txt")); 
               File file = null;
               
               String fileName = null;
               if(select==JFileChooser.APPROVE_OPTION){
                   file =jfc.getSelectedFile();   
               }
               fileName = jfc.getName(file);
               if(fileName==null|| fileName.trim().length()==0){
                   JOptionPane.showMessageDialog(DrawingApp.this, "Empty!");
               }
               
               if(file.isFile()){
                   fileName = file.getName();
               }
               file = jfc.getCurrentDirectory();
               
               String path = file.getPath()+fileName;
               file =new File(path);
           
                if(file.exists()) { 
                    int i = JOptionPane.showConfirmDialog(DrawingApp.this, "File exist, do you want to replace it ?");     
                    if(i == JOptionPane.YES_OPTION)   ;     
                    else   return ;    
                    } 
				try {
					ImageIO.write(bufImg, "jpeg", new File("test1.jpg"));
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		Quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		Line.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		Rect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		fRect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		Ellipse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		fEllipse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

	}

	public static void main(String[] args) {
		new DrawingApp();
	}

}
