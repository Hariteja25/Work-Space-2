package algorithm;

public class testrpchrctr {

	public static void main(String[] args) {
		TestDemo t=new TestDemo();
		try {
		char res=TestDemo.firstNonRepeatedCharacter("s w w i s s");
		System.out.println(res);
		}
		
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
	}

}
