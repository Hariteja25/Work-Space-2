package stringBuffer;

public class TestStr {
	public static void main(String[] args) {
		String text ="user1";
		text = text + " user2";
		text = text + " user3";
		text = text + " user4";
		text = text + " user5";
		System.out.println(text);
		
		//9 objs are created; 1 is active in above code
		
		//one obj is created
		StringBuffer textBuf =new StringBuffer("user1");
		textBuf.append(" user2");
		textBuf.append( " user3");
		textBuf.append(" user4");
		textBuf.append( " user5");
		System.out.println(textBuf.toString());
		
		
		//one obj is created
		StringBuilder textBuild =new StringBuilder("user1");
		textBuild.append(" user2");
		textBuild.append( " user3");
		textBuild.append(" user4");
		textBuild.append( " user5");
		System.out.println(textBuild.toString());
	
	}
}



