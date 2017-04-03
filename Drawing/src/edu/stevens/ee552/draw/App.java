package edu.stevens.ee552.draw;

public class App extends JFrame {
	private HashMap<String, ActionListener> actionMap;
	public App(String title, int w, int h, String[][] menus, Color bgColor) {
		super(title);
		setSize(w,h);
		setBackground(bgColor);
		//make the file menu etc
		setVisible(True);
	}
	public App(String confFile) {
		
	}
}
