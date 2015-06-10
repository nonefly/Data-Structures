package com.nonefly.arrays;

import java.math.BigDecimal;

/**
 * p[i][j] = a[i]*b[j]
 * 
 * @author nonefly Jun 9, 2015
 */
public class Test15 {
	// my bad code

//	private static double[][] outerProduct(double[] x, double[] y) {
//		double[][] product = new double[x.length][y.length];
//		for (int i = 0; i < x.length; i++) {
//			for (int j = 0; j < y.length; j++) {
//				BigDecimal ai = new BigDecimal(x[i]);
//				BigDecimal aj = new BigDecimal(y[j]);
//				product[i][j] = new Double(ai.multiply(aj).toString());
//			}
//		}
//		return product;
//	}

	private static double[][] outerProduct(double[] x, double[] y) {
		double[][] product = new double[x.length][y.length];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < y.length; j++) {
				product[i][j] = x[i] * y[j];
			}
		}
		return product;
	}

	// 原书范例有误 改正如下

//	private static double[][] outerProduct(double[] x, double[] y) {
//		double[][] z = new double[x.length][y.length];
//		int i = 0, j = 0;
//		for (double xi : x) {
//			for (double yj : y) {
//				z[i][j] = xi * yj;
//				++j;
//			}
//			++i;
//		}
//		return z;
//	}

	public static void main(String[] args) {
		double[] x = { 1, 2.12, 3, 4, 5 };
		double[] y = { 2, 3, 4, 22.6, 5, 7 };
		double[][] c = outerProduct(x, y);
		for (double[] ds : c) {
			for (double d : ds) {
				System.out.print(d + " ");
			}
			System.out.println();
		}
	}
}
