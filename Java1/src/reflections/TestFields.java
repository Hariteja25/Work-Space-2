package reflections;
/*
 print obj data using the reflection api // use Field obj to print obj data , field.get(empObj)
print the data type for the field. // field.getType()

Hint:
//get the class object
		Class  classObj = Class.forName("reflections.Emp");
		Field[] fields = classObj.getDeclaredFields();
	
		System.out.println("************** Print fields ***************************");
		//get the field objs for the instance variables
		for(Field field: fields){
			System.out.println(field.getName());
		}
    
 */

import java.lang.reflect.Field;

import reflections.Emp;

public class TestFields {
	public static void main(String[] args) throws Exception {
		Class classEmp =  Class.forName("reflections.Emp");
		Field[] fields = classEmp.getDeclaredFields();
		Emp e = new Emp();
		e.id = 2000;
		e.age = 45;
		e.name ="ram";
		for (Field field : fields) {
			System.out.println("Variable name : " + field.getName());
			System.out.println("Datatypes of the variable :" + field.getType());
			System.out.println("Value of the variable : " + field.get(e));
			//System.out.println();
			System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		}
	}
}
