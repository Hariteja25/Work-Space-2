package java8Features.lambda;
/*
 
Req:
call the method process() by passing "Kumar" print Hello  Kumar
call the method process() by passing "Kumar" print Hi  Kumar
call the method process() by passing "Kumar" print Welcome  Kumar

solution:
-----------------
Lambda expression with single parameter.
 */

public class TestLambda3 {
public static void main(String[] args) {
//using anonymous
System.out.println("***************using anonymous******************");
Service2 s1= new Service2() {

@Override
public void process(String name) {
System.out.println("Hello "+ name);
}
};
s1.process( "Kumar");

System.out.println("**************With lambda************************");
//lambda
Service2 s2 = (name) -> { System.out.println("Hello "+ name); }; // no mention of class , no mention process method
s2.process("Kumar");

Service2 s3 = (name) -> { System.out.println("Hi "+ name); };
s3.process("Kumar");

Service2 s4 = (name) -> { System.out.println("Welcome "+ name); };
s4.process("Kumar");

}
}

