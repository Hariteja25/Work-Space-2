package innerClasses;

public class Outer {
	private int data = 30;

	public void print(){
		System.out.println(data);
	}
	
	//inner clsss start
  class Inner {
		int age;
		void msg() {
			System.out.println("data is " + data); // access outer class instance variable
		}
	}
  	//inner clsss end
  
  
}
  
  
  
  
  