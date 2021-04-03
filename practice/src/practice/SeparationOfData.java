package practice;

public class SeparationOfData {

	public static void main(String[] args) {
		String s="1ewAte26C3k1#@!eq12wtq1*3";
		String numbers="";
		String nonnumbers="";
		String Splchr="";
		
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)>=48&&s.charAt(i)<=57) {
				numbers=numbers+s.charAt(i);
			}
			else if(s.charAt(i)>=65&&s.charAt(i)<=90||s.charAt(i)>=97&&s.charAt(i)<=122){
				nonnumbers=nonnumbers+s.charAt(i);
			}
			else {
				Splchr=Splchr+s.charAt(i);
				
			}
		}
		
		System.out.println(numbers);
		System.out.println(nonnumbers);
		System.out.println(Splchr);

	}

}
