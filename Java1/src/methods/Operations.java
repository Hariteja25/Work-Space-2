package methods;

import java.util.Scanner;

public class Operations {
	
	// method with no retun type and no input args
		public void show() {
			System.out.println("helloo welcome to show");
			System.out.println("bye.....");
		}
		
		//method with no return type and 1 input arg [String]
		 public void printName(String data) {
			 System.out.println("Mr/Mrs " + data);
		 }
		 
		//method with no return type and 2 input arg [int, int]
		 public void sum(int x , int y) {
			 //here x and y are local variables.
			//local variables : varibales creatd inside the method
			 int z = x+y;
			 System.out.println("sum is :: "+z);
		 }
		 
		//,method with a return value[string] and no input args
		 // one method can return only one value
		 //return statement is mandatory
		 public String getData() {
			 return "welcome to data";
		 }
		 
		 
		 //,method with a return value[string] and 1 input arg[String]
		 public String process(String name) {
			 return "My Dear "+name;
		 }
		 
		//,method with a return value[1] and 2 input arg[int]
		 public int big(int x , int y) {
			 if(x>y) {
				 return x;
			 }
			 else {
				 return y;
			 }
		 }
		 
		//,method with a return value[1] and 2 input arg[int]
		 public int small(int x , int y) {
			 if(x<y) {
				 return x;
			 }
			 else {
				 return y;
			 }
		 }
		 
		//,method with a return value[1] and 3 input arg[int]
		 public int big(int x , int y,int z) {
			 if(x>y && x>z) {
				 return x;
			 }
			 else if(y>z) {
				 return y;
			 }
				 
			 else {
				 return z;
			 }
		 }
		//,method with a return value[1] and 3 input arg[int]
		 public int small(int x , int y,int z) {
			 if(x<y && x<z) {
				 return x;
			 }
			 else if(y<z) {
				 return y;
			 }
				 
			 else {
				 return z;
			 }
		 }
		 public void mult(int n) {
			
				for(int i=1;i<=10; i++){
					System.out.println(  n+"*"+i+"="+n*i);
					
				}
				
		 }
		 public int fact(int n) {
		 int factorial=1;
			
			for(int i=1;i<=n;i++)
			{
				factorial=factorial*i;
			}
			return factorial;

}
}
