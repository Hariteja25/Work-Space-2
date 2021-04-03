package practice;

import java.util.Stack;

public class revsrse_stack {
	public static void main(String[] args) {
		String a="RamaSita";
		String t="";
		Stack s=new Stack();
		for(int i=0;i<a.length();i++) {
			s.push(a.charAt(i));
			
		}
		while(s.isEmpty()==false) {
			t=t+s.pop();
		}
		System.out.println("Reverse of string using stack");
		System.out.println(t);
		
	}

}
