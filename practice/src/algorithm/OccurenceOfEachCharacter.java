package algorithm;

import java.util.Arrays;

public class OccurenceOfEachCharacter {

	public static void main(String[] args) {
		
		String s ="samsung";
		char ar[] = s.toCharArray();
		Arrays.sort(ar);
		
		System.out.println(ar);
		
		String res = new String(ar);
		
		while(res.length()>0) {
			
			char pc = res.charAt(0);
			int occurence =res.lastIndexOf(pc)-res.indexOf(pc)+1;
			
			System.out.println(pc+"---"+occurence);
			res=res.replace(""+pc,"");
			
			
			
		}
		

	}

}
