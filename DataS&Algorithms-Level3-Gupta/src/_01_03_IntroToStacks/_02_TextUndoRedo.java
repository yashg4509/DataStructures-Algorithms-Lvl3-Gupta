package _01_03_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener{
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	JFrame frame = new JFrame();
	JPanel pnl = new JPanel();
	JLabel label = new JLabel();
	Stack<Character> deletedChars = new Stack<>();
	
	public static void main(String[] args) {
		_02_TextUndoRedo obj = new _02_TextUndoRedo();
		obj.createGUI();
	}
	
	public void createGUI() {
		pnl.add(label);
		frame.add(pnl);
		frame.addKeyListener(this);
		frame.pack();
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		char letter = e.getKeyChar();
		label.setText(label.getText() + letter);
		frame.pack();
		

		if(e.getKeyCode() == 8) {
			String x = label.getText();
			label.setText(x.substring(0, x.length() - 2));
			deletedChars.add(letter);
		}
		
		if(e.getKeyCode() ==  90) {
			if(deletedChars.size() > 0) {
			char y = deletedChars.pop();
			label.setText(y + "");
			}
			else {
				label.setText("");
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
