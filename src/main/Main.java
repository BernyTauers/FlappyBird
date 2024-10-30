package main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main implements ActionListener{
	JFrame jFrame;
	JPanel jPanel;
	
	Main(){
		jPanel = new JPanel();
		jPanel.setSize(360,640);
		jPanel.setBackground(Color.YELLOW);
		
		
		
		
		
		jFrame = new JFrame("Flappy Bird");
		jFrame.setSize(360,640);
		jFrame.setResizable(false);
		jFrame.setLocationRelativeTo(null);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.add(jPanel);
		jFrame.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Main();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
