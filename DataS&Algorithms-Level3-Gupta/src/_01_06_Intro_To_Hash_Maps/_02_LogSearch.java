package _01_06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
	HashMap<Integer, String> hash = new HashMap<>();
	JFrame frame;
	JPanel pnl;
	JButton addEntry;
	JButton searchID;
	JButton viewList;
	
	void createGUI() {
		frame = new JFrame("Log Search");
		pnl = new JPanel();
		addEntry = new JButton("Add Entry");
		searchID = new JButton("Search by ID");
		viewList = new JButton("View List");
		
		addEntry.addActionListener(this);
		searchID.addActionListener(this);
		viewList.addActionListener(this);
		pnl.add(addEntry);
		pnl.add(searchID);
		pnl.add(viewList);
		frame.add(pnl);
		frame.pack();
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		_02_LogSearch logSearch = new _02_LogSearch();
		logSearch.createGUI();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == addEntry) {
			String ID = JOptionPane.showInputDialog("Please enter your ID Number: ");
			int IDNo = Integer.parseInt(ID);
			String name = JOptionPane.showInputDialog("Please enter your name: ");
			hash.put(IDNo, name);
		}
		
		if(e.getSource() == searchID) {
			String ID = JOptionPane.showInputDialog("Please enter an ID number: ");
			int IDNo = Integer.parseInt(ID);
			
			for (Integer i: hash.keySet()) {
				if(IDNo == i) {
					JOptionPane.showMessageDialog(null, "Welcome, " + hash.get(i) + ".");
				}
			}
		}
		
		if(e.getSource() == viewList) {
			String content = "";
			for(Integer i: hash.keySet()) {
				content += "ID: " + i + " Name: " + hash.get(i) + "\n";
			}
			JOptionPane.showMessageDialog(null, content);
		}
	}
	
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	
}
