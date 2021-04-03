package practice;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s="Mother in law";
		String t="Hitler women";
		
		s=s.replace(" ", "");
		t=t.replace(" ", "");
		
		s=s.toLowerCase();
		t=t.toLowerCase();
		
		
		char s1[]=s.toCharArray();
		char s2[]=t.toCharArray();
		
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		if(Arrays.equals(s1, s2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not a Anagram");
		}
	}

}
