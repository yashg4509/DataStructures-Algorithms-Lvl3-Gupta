package _01_01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> strArrLs = new ArrayList<>();
		//2. Add five Strings to your list
		strArrLs.add("I ");
		strArrLs.add("hate ");
		strArrLs.add("online ");
		strArrLs.add("health ");
		strArrLs.add(". ");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < strArrLs.size(); i++) {
			System.out.println(strArrLs.get(i));
		}
		
		//4. Print all the Strings using a for-each loop
		for (String string : strArrLs) {
			System.out.println(string);
		}
		//5. Print only the even numbered elements in the list.
		for (String str: strArrLs) {
			if(strArrLs.indexOf(str)%2==0) {
				System.out.println(str);
			}
		}
		//6. Print all the Strings in reverse order.
		for (int i = (strArrLs.size() - 1); i >= 0; i--) {
			System.out.println(strArrLs.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		char letter = 'e';
		for (int i = 0; i < strArrLs.size(); i++) {
			String str = strArrLs.get(i);
			if(str.charAt(i) == letter) {
				System.out.println(str);
			}
		}
	}
}
