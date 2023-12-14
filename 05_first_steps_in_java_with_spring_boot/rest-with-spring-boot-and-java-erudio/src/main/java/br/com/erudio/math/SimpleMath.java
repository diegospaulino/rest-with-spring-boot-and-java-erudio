package br.com.erudio.math;

import br.com.erudio.exceptions.UnsupportedMathOperationException;

public class SimpleMath {

	public Double sum(Double numberOne, Double numberTwo) {
		
		return numberOne + numberTwo;
	}
	
	public Double subtraction(Double numberOne, Double numberTwo) {

		return numberOne - numberTwo;
	}
	
	public Double multiplication(Double numberOne, Double numberTwo) {
		
		return numberOne * numberTwo;
	}
	
	public Double division(Double numberOne, Double numberTwo) {
		
		Double total = 0D;
		
		if(numberTwo == 0) {
			throw new UnsupportedMathOperationException("Number two cannot be zero!");
		}
		else {
			total = numberOne / numberTwo;
		}
		
		return total;
	}
	
	public Double mean(Double numberOne, Double numberTwo) {
		
		Double total = 0D;
		
		Double sumValues = sum(numberOne, numberTwo);
		total = sumValues / 2;
		
		return total;
	}
	
	public Double squareRoot(Double number) {
		
		Double total = 0D;
		total = Math.sqrt(number);
		
		return total;
	}
	
}
