package practice;

public class palindrome {
	public static void main(String[] args) {
		String s="abcbcba";
		int c=0;
		for(int si=0,ei=s.length()-1;si<ei;si++,ei--) {
			
			if(s.charAt(si)==s.charAt(ei)) {}
			else {
				c++;
			}
		}
		
		if(c==0) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
			
		
	}

}
