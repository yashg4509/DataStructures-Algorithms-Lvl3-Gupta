package _02_Firework_Display;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class FireworkDisplay extends JPanel implements ActionListener {
	public static int WIDTH = 720;
	public static int HEIGHT = 480;
	
	private JFrame window;
	private JPanel buttonPanel;
	private JButton squirtButton;
	private Timer timer;
	
	Firework firework = new Firework();
	
	public static void main(String[] args) {
		new FireworkDisplay().start();
	}
	
	public void start() {
		window = new JFrame();
		window.setLayout(new BorderLayout());
		window.add(this, BorderLayout.CENTER);
		
		WIDTH = Toolkit.getDefaultToolkit().getScreenSize().width;
		HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height;
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
		buttonPanel = new JPanel();
		squirtButton = new JButton("FIRE");
		squirtButton.addActionListener((e)->{
			fire();
		});
		
		buttonPanel.add(squirtButton);
		window.add(buttonPanel, BorderLayout.SOUTH);
		
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		timer = new Timer(1000 / 60, this);
	}
	
	private void fire() {
		squirtButton.setEnabled(false);
		firework = new Firework();
		firework.launch();
		timer.start();		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(new Color(10, 30, 70));
		g.fillRect(0, 0, WIDTH, HEIGHT);
		firework.drawSparks(g);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		firework.updateSparks();
		repaint();
		
		boolean reset = true;
		if(!firework.dead) {
			reset = false;
		}
		if(reset) {
			timer.stop();
			squirtButton.setEnabled(true);
		}
	}
}
