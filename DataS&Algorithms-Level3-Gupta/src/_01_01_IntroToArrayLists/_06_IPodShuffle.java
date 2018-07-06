package _01_01_IntroToArrayLists;

import java.awt.Dimension;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener{
		JFrame frame = new JFrame();
		JPanel pnl = new JPanel();
		JButton supriseBtn = new JButton("Suprise Me!");
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
		Song sPlayer = new Song("demo.mp3");
		sPlayer.play();
		
		ArrayList<Song> songs = new ArrayList<>();
		
		this.createInterface();
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
		
	}
	
	public void createInterface() {
		
		frame.setSize(new Dimension(800, 600));
		frame.add(pnl);
		supriseBtn.addActionListener(this);
		pnl.add(supriseBtn);
		frame.pack();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
	}
	public static void main(String[] args) {
		new _06_IPodShuffle();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}