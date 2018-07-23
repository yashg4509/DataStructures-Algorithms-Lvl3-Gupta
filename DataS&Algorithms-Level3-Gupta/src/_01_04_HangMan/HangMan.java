package _01_04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener{
	Utilities util = new Utilities();
	Stack<String> words = new Stack<>();
	String content;
	String word; 
	JLabel label = new JLabel();
	
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
		JFrame frame = new JFrame();
		JPanel pnl = new JPanel();
		String popped = words.pop();
		content = "_ ";
		
		word = popped;
		
		for (int i = 0; i < popped.length(); i++) {
			content += "_ ";
		}
		
		label.setText(content);
		label.addKeyListener(this);
		pnl.add(label);
		frame.add(pnl);
		frame.pack();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	public static void main(String[] args) {
		HangMan player = new HangMan();
		player.start();
		player.gameSetup();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		char type = e.getKeyChar();
		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			
			if(letter == type) {
				content = letter + "";
				
				for (int i1 = 0; i1 < (word.length() - 1); i1++) {
					content += "_ ";
					label.setText(content);
				}
				
				break;
			}
			
			else {
				System.out.println("WRONG");
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}
	
}
