package _03_00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String temp = "";
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(i%2 == 1) {
				c = Character.toUpperCase(c);
			}
			
			if(i%2 == 0) {
				c = Character.toLowerCase(c);
			}
			
			temp += c;
		}
		
		return temp;
	}

}
