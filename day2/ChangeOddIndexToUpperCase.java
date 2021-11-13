package week1.day2;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
		String str = "welcome";
		char[] charArray = str.toCharArray();
		int charlength = charArray.length;
		for (int i = 0; i < charlength; i++) {
			
			if (i%2 !=0) {
				char uppercase = Character.toUpperCase(charArray[i]);
				System.out.print(uppercase);
			} else {
               System.out.print(charArray[i]);
			}
			
		}
	}

}
