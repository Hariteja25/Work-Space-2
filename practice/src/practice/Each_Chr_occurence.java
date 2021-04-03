package practice;

import java.util.Arrays;

public class Each_Chr_occurence {
	public static void main(String[] args) {
		
		String s="ramasitahunuman";
		
		char ar[]=s.toCharArray();
		
		Arrays.sort(ar);
		String t=new String(ar);
		System.out.println(t );
		
		int c=1;
		for(int i=0;i<s.length()-1;i++) {
			
			if(s.charAt(i)==s.charAt(i+1)) {
				c++;
			}
			else {
				System.out.println(s.charAt(i)+"---"+c);
				c=1;
			}
			
		}
		System.out.println(s.charAt(s.length()-1)+"---"+c);
	
		
	}

}
