package innerClasses;
/*
 /create obj for inner class
Outer.Inner nestedObject = new Outer.Inner();

 */

public class StaticOuterTest {
	public static void main(String args[]) {
		StaticOuter.Inner obj = new StaticOuter.Inner();
		obj.msg();
	}
}
