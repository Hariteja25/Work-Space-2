package algorithm;

public class stringpool {
	public static void main(String[] args) {
		
		String s1="hari";
		String s2=new String("hari");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1==s2);
	}

}
