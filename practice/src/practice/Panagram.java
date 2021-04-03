package practice;

public class Panagram {

	public static void main(String[] args) {
		String s="The quick brown fox jumps over a lazy dog";
		s.toUpperCase();
		int c=0;
		for(int i=65;i<=90;i++) {
			char pc=(char)(i);
			if(s.contains(pc+"")) {
				c++;
			}
		}
		if(c==26) {
			System.out.println("Panagram");
		}
		else {
			System.out.println("Not a Panagram");
		}
		
	}

}
