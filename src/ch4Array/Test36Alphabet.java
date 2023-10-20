package ch4Array;

public class Test36Alphabet {

	public static void main(String[] args) {
		
		char letter = 65;//='A'    character,정수와 같은 취급 ASCH code
		//char c = 'A'
		//int n = 65;
		//(c == n)
		char[] alphabet = new char [26];
		
		for(int i=0; i< alphabet.length; i++) {
			alphabet[i] = (char) (letter+i);
		}
		for(char c: alphabet) {
			System.out.println(c);
		}
	}

}
