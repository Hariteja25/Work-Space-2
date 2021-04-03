package innerClasses;
/*
 //create obj for outer class
Outer outerObject = new Outer() ;


//create obj for inner class
Outer.Inner innerObject = outerObject.new Inner();

 */



public class Test1 {
	public static void main(String args[]) {
		Outer obj = new Outer();
		obj.print();
		
		Outer.Inner in = obj.new Inner();
		in.msg();
	}
}