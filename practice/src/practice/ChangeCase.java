package practice;

public class ChangeCase {
	
	
	static String change(String data) {
		
		
		  String t="";
		  
		  if(data.charAt(0)>=97&&data.charAt(0)<=122) { 
			  t=t+(char)(data.charAt(0)-32);
		  } 
		  else {
			  t=t+data.charAt(0); 
			  }
		  
		  for(int i=1;i<data.length();i++) {
		  if(data.charAt(i)>=65&&data.charAt(i)<=90) { 
			  t=t+(char)(data.charAt(i)+32); 
			  }
		  else {
			  t=t+data.charAt(i); 
		  }
		  
		  } 
		  return t;
		 
	
	
	}
	
	public static void main(String[] args) {
		String s="this is my world of unknown adventures";
		String ar[]=s.split(" ");
		for(String data:ar) {
			System.out.print(change(data)+""+" ");	
		}
	}

	  

}
