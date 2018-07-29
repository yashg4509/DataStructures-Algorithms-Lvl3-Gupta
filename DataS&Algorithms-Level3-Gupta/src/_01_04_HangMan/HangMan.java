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
		content = new String[word.length()];
		
		for (int i = 0; i < (word.length() - 1); i++) {
			content[i] = "_ ";
		}
		
		label.setText(contentToString());
		pnl.add(label);
		frame.add(pnl);
		frame.pack();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
	void game() {
		lives = 10;
		
		for (int i = 0; i < lives; i++) {
			String guess = JOptionPane.showInputDialog("Enter a guess: ");
			guessCheck(guess);
			
			if(lives < 10) {
				JOptionPane.showMessageDialog(null, "Eh.....BADDDD!!!");
			}
		}
		
//			
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
		for (int i = 0; i < (content.length - 1); i++) {
			str += content[i];
		}
		return str;
	}
	
	public void guessCheck(String guess) {
		for (int i = 0; i < word.length(); i++) {
			char currentLetter = word.charAt(i);
			if(currentLetter == guess.charAt(0)) {
				content[i] = word.charAt(i) + "";
				label.setText(contentToString());
				frame.pack();
			}
		}
	}
	
	public static void main(String[] args) {
		HangMan player = new HangMan();
		player.start();
		player.gameSetup();
		player.game();
	}
	
}

