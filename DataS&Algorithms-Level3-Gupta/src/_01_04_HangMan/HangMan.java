package _01_04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan{
	Utilities util = new Utilities();
	Stack<String> words = new Stack<>();
	String content;
	String word; 
	JLabel label = new JLabel();
	JFrame frame = new JFrame();
	JPanel pnl = new JPanel();
	int lives;
	
	@SuppressWarnings("static-access")
	public void start() {
		
		@SuppressWarnings("static-access")
		String numStr = JOptionPane.showInputDialog("Choose a number between 1 to " + util.getTotalWordsInFile("dictionary.txt") + ".");
		int size = Integer.parseInt(numStr);
		int[] positions = new int[size];
		
		for (int i = 0; i < positions.length; i++) {
			String line = util.readRandomLineFromFile("dictionary.txt");
			words.push(line);
		}
		
		for (int i = 0; i < words.size(); i++) {
			System.out.println(words.get(i));
		}
	}
	
	void gameSetup() {
		word = words.pop();
		content = "_ ";
		
		for (int i = 0; i < word.length(); i++) {
			content += "_ ";
		}
		
		label.setText(content);
		pnl.add(label);
		frame.add(pnl);
		frame.pack();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
	void game() {
		lives = 10;
		
		ArrayList<String> incorrectGuess = new ArrayList<>();
		for (int i = 0; i < lives; i++) {
			String guess = JOptionPane.showInputDialog("Enter a guess: ");
			incorrectGuess.add(guess);

		}
		
	}
	public static void main(String[] args) {
		HangMan player = new HangMan();
		player.start();
		player.gameSetup();
		player.game();
	}
	
}

