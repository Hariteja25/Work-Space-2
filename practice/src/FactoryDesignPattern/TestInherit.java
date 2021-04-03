package FactoryDesignPattern;

import java.util.Scanner;

public class TestInherit{

public static void main(String[] args) {
//Take Bank name as input
Scanner sc = new Scanner(System.in);
System.out.println("Enter your salary bankname:");
String salBank = sc.next();

RBI r = null;

if (salBank.equals("hdfc")) {
r = new Hdfc(); //create obj for HDFC and refer by RBI
}else if (salBank.equals("sbi")) {
r = new SBI();//create obj for SBI and refer by RBI
} else if (salBank.equals("icici")) {
r = new Icici();//create obj for Icici and refer by RBI
}

r.processLoan();

}
}