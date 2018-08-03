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
	String[] content;
	String word; 
	JLabel label = new JLabel();
	JLabel livesLbl = new JLabel();
	JFrame frame = new JFrame();
	JPanel pnl = new JPanel();
	int lives = 10;
	
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
		
		
//		for (int i = 0; i < words.size(); i++) {
//			System.out.println(words.get(i));
//		}
	}
	
	void gameSetup() {
		word = words.pop();
		content = new String[word.length()];
		
		for (int i = 0; i < word.length(); i++) {
			content[i] = "_ ";
		}
		
		label.setText(contentToString());
		pnl.add(label);
		pnl.add(livesLbl);
		frame.add(pnl);
		frame.pack();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
	void game() {
		
		for (int i = 0; i < 26; i++) {
			String guess = JOptionPane.showInputDialog("Enter a guess: ");
			guessCheck(guess);
			livesLbl.setText("Lives: " + lives);
			frame.pack();
			
			
			if(lives <= 0) {
				JOptionPane.showMessageDialog(null, "Eh.....BADDDD!!! The word was: " + word);
				System.exit(0);
			}
		}

		
//			for (int j = 0; j < guess.length(); j++) {
//				if(word.contains(guess.charAt(j) + "")) {
//					content[word.indexOf(guess.charAt(j) + "")] = guess.charAt(j) + "";
//					label.setText(contentToString());
//					frame.pack();
//				}
//			}
//			
//		}
		
	} 
	
	public String contentToString() {
		String str = "";
		for (int i = 0; i < content.length; i++) {
			str += content[i];
		}
		return str;
	}
	
	public void guessCheck(String guess) {
		boolean isMatching = false;
		for (int i = 0; i < word.length(); i++) {
			char currentLetter = word.charAt(i);
			if(currentLetter == guess.charAt(0)) {
				isMatching = true;
				content[i] = word.charAt(i) + "";
				label.setText(contentToString());
				frame.pack();
			}
		}
		
		if(!(isMatching)) {
			lives--;
		}
		
		String guessWord = "";
		for (int i = 0; i < content.length; i++) {
			guessWord += content[i];
		}
		
		if(word.equals(guessWord)) {
			JOptionPane.showMessageDialog(null, "Congrats! You aren't like Eric Pork!");
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		HangMan player = new HangMan();
		player.start();
		player.gameSetup();
		player.game();
	}
	
}

