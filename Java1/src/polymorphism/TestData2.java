package polymorphism;

public class TestData2 {
public static void main(String[] args) {
  		
        Data2 cal = new Data2();
       
        //call add funtion by passing two long values
        long a1 = cal.add(44545454l, 545454545l);
		System.out.println(a1);
  		  
      //call add funtion by passing two float values
        float a2 = cal.add(12.76f, 13.66f);
		System.out.println(a2);
        
	    //call add funtion by passing two int values
        long a3 = cal.add(5, 6);
		System.out.println(a3);    
  		  
      }
//for int 
//1. is same data type exists? no
//2. looks for similat data types 
// long , float , double
//3. nearest matching datatypes for int
//long
}
