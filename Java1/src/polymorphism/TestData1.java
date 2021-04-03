package polymorphism;

public class TestData1 {
	public static void main(String[] args) {
		//create obj
		Data1 data = new Data1();
		
		
		float a2 = data.add(12.76f, 13.66f);// float, float
		System.out.println(a2);
		
		float a1 = data.add(4, 5);//int, int
		System.out.println(a1);
		
	}

}
