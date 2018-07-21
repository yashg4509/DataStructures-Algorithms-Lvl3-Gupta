package _01_03_IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
	public static void main(String[] args) {
		Random r = new Random();

		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack<Double> intro = new Stack<>();
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		for (int i = 0; i < 101; i++) {
			intro.push(r.nextDouble()*100);
		}
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		String res1 = JOptionPane.showInputDialog("Enter a number between 0 to 100 (inclusive)");
		String res2 = JOptionPane.showInputDialog("Enter another number between 0 to 100 (inclusive)");
		int num1 = Integer.parseInt(res1);
		int num2 = Integer.parseInt(res2);
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		if(num2 > num1) {
		for (int i = 0; i < 100; i++) {
			double pop = intro.pop();
			if((pop > num1) && (pop < num2))
			System.out.println("Removed object is: " + pop);
		}
		}

		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
