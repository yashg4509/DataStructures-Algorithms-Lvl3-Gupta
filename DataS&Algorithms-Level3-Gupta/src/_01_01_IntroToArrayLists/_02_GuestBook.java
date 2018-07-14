package _01_01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
	JFrame frame;
	JPanel pnl;
	JButton addName;
	JButton viewNames;
	
	ArrayList<String> guestNames = new ArrayList<>();
	 // Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	void createGUI(){
		frame = new JFrame("Guest Book");
		pnl = new JPanel();
		addName = new JButton("Add Name");
		viewNames = new JButton("View Names");
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		addName.addActionListener(this);
		viewNames.addActionListener(this);
		
		pnl.add(addName);
		pnl.add(viewNames);
		frame.add(pnl);
		frame.pack();
	}
	
	public static void main(String[] args) {
		_02_GuestBook x = new _02_GuestBook();
		x.createGUI();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == addName) {
			String i = JOptionPane.showInputDialog("Please enter the new guest's name: ");
			guestNames.add(i);
		}
		
		else if(e.getSource() == viewNames) {
			String stuffs = "";
			for(int i = 0; i < guestNames.size(); i++) {
				stuffs += "Guest #" + (i+1) + ": " + guestNames.get(i) + "\n";
			}
			JOptionPane.showMessageDialog(null, stuffs);
		}
		
	}
	
	
}
