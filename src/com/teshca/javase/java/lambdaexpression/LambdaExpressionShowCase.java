package com.teshca.javase.java.lambdaexpression;

import java.io.Console;

public class LambdaExpressionShowCase {

	public void SimpleLambdaExpression() {		
		IntegerFunctionalInterface integerFunctionalInterface;		
		integerFunctionalInterface = () -> 123.99;
		
		double number;
		number = integerFunctionalInterface.getNumber();
		
		System.out.println("SimpleLambdaExpression result is " + number);
	}
	
}
