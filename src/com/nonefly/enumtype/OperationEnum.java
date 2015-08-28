package com.nonefly.enumtype;
/**
 * 简单四则运算
 * @author nonefly
 * Aug 2, 2015
 */
public class OperationEnum {
	private enum Operation{
		PLUS("+"){
			double apply(double x, double y) { return x + y; }
		},
		MINUS("-"){
			double apply(double x, double y) { return x - y; }
		},
		MUL("*"){
			double apply(double x, double y) { return x * y; }
		},
		DIV("/"){
			double apply(double x, double y) { return x / y; }
		};
		private final String symbol; 
		
		abstract double apply(double x, double y);
		
		private Operation(String symbol) {
			this.symbol = symbol;
		}
		@Override
		public String toString() {
			return symbol;
		}
	} 
	public static void main(String[] args) {
		double x = 1, y = 2;
		for (Operation op : Operation.values()) {
			System.out.printf("%f %s %f = %f%n",x, op, y, op.apply(x, y));
		}
	}
}
