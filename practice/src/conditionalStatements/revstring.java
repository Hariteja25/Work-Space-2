package conditionalStatements;

public class revstring {
	public static void main(String[] args) {

		String s = "hello";
		StringBuilder sb=new StringBuilder();
		s.chars().distinct().forEach(p->sb.append((char)p));

		System.out.println(sb);
	}

}
