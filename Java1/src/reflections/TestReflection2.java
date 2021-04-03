package reflections;
/*
 How to create the object using Reflection API?
 -----------------------------------------------------------
 
 1.create class Obj
 2.use newInstance() method for object creation
 
 syntax:
 Class  classObj = Class.forName("reflections.Emp");
 Emp empObj1 = new Emp(); // regular approach for obj creation
 Emp empObj2 =(Emp)classObj.newInstance(); // relection way of object creation
 */

public class TestReflection2 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//get the class object
		Class  classObj = Class.forName("reflections.Emp");
		Emp empObj = (Emp) classObj.newInstance(); // this will create employee object and type casting is mandatory
		
		//set data
		empObj.id=1200;
		empObj.name="kumar";
		
		//print data
		System.out.println(empObj.id);
		System.out.println(empObj.name);
	}
}

 
