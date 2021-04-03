package java8Features.lambda;
/*
 Req:
1.call calculate() method by passing 200,100 and perform addition
2.call calculate() method by passing 200,100 and perform substraction
3.call calculate() method by passing 200,100 and perform division


 */

public class TestLambda4 {
public static void main(String[] args) {

System.out.println("********************Anonymous inner***************************");
MyCalculator c1 = new MyCalculator() {
@Override
public void calculate(int a, int b) {
System.out.println(a+b);
}
};
c1.calculate(200, 100);

System.out.println("********************Lambda inner***************************");
MyCalculator c2 = (a,b) -> { System.out.println("addition = "+ (a+b)); };
c2.calculate(200, 100);

MyCalculator c3 = (a,b) -> { System.out.println("substraction = "+ (a-b)); };
c3.calculate(200, 100);


MyCalculator c4 = (a,b) -> { System.out.println("division = "+ (a/b)); };
c4.calculate(200, 100);

}
}

