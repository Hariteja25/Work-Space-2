package reflections;
/*
 Req:
to print the Emp class information

instace variable ==========> Field class
methods ==============> Method class

Uisng class obj we need to retrieve the Fields and Methods and using loop print 

How to get the class Obj?
Class  classObj = Class.forName("reflections.Emp");
  

How to get the instance variables for the class?
Field[] fields = classObj.getDeclaredFields();


How to get the methods for the class?
Method[] methods = classObj.getMethods();
 */

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflection {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		//get the class object
		Class  classObj = Class.forName("reflections.Emp");
		Field[] fields = classObj.getDeclaredFields();
	
		System.out.println("************** Print fields ***************************");
		//get the field objs for the instance variables
		for(Field field: fields){
			System.out.println(field.getName());
		}
		
		System.out.println("************** Print Methods ***************************");
		//get the method objs for the methods
		Method[] methods = classObj.getMethods();
		for(Method method: methods){
			System.out.println(method.getName());
		}
		
	}
}
