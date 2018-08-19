package _03_00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String temp = "";
		
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			
			temp += c;
		}
		
		return temp;
	}

}
