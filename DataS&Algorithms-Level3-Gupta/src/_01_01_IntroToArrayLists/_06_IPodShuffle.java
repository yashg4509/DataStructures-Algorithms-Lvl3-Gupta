package _01_01_IntroToArrayLists;

<<<<<<< HEAD
import java.awt.event.ActionEvent;
=======
import java.awt.Dimension;
import java.awt.event.ActionEvent;

>>>>>>> b8f460a5e2fdbcdf4024c2a090395a4d5dc0e7b5
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener{
<<<<<<< HEAD
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
		Song sPlayer = new Song("/demo.mp3");
		sPlayer.play();
		
				
=======
		JFrame frame = new JFrame();
		JPanel pnl = new JPanel();
		JButton supriseBtn = new JButton("Suprise Me!");
		ArrayList<Song> songs = new ArrayList<>();
		Song pythonIsGay;

	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
				
		this.createInterface();
		this.addSongs();
>>>>>>> b8f460a5e2fdbcdf4024c2a090395a4d5dc0e7b5
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
		ArrayList<Song> songs = new ArrayList<>();
		JFrame frame = new JFrame();
		JPanel pnl = new JPanel();
		JButton supriseMe = new JButton("Suprise Me!");
		
		supriseMe.addActionListener(this);
		pnl.add(supriseMe);
		frame.add(pnl);
		
		if(e.getSource == )
	}
	
	public void addSongs() {
		Song song1 = new Song("yellow-walzer.mp3");
		Song song2 = new Song("demo.mp3");
		Song song3 = new Song("bhangra.wav");
		Song song4 = new Song("eric.wav");
		
		songs.add(song1);
		songs.add(song2);
		songs.add(song3);
		songs.add(song4);
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
<<<<<<< HEAD
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
=======
	public void actionPerformed(ActionEvent e) {
		Random r = new Random();
		if(e.getSource() == supriseBtn) {
			if(pythonIsGay != null) {
				pythonIsGay.stop();
			}
				int priceOfEricSlave = r.nextInt(songs.size());
				pythonIsGay = songs.get(priceOfEricSlave);
				pythonIsGay.play();
			}
		}
	}
>>>>>>> b8f460a5e2fdbcdf4024c2a090395a4d5dc0e7b5
