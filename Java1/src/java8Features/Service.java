package java8Features;
/*
 Functional interfaces
-----------------------------------

An Interface that contains exactly one abstract method is known as functional interface.
helps to achieve functional programming approach.

We need to use annotation @FunctionalInterface for specifing the Functional interface.
 */

@FunctionalInterface
public interface Service {

		void process(String str);
		
	}