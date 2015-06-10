package com.nonefly.arrays;


/**
 * 杨辉三角
 * @author nonefly
 * Jun 10, 2015
 */
public class pascalTest {
	//I think it's better than the answer gived
	private static int[][] pascal(int size){
		if(size < 1)
			throw new ArrayIndexOutOfBoundsException("输入不合法:"+size);
		int[][] pascalTriangle = new int[size][size];
		pascalTriangle[0][0] = 1;
		for (int i = 0; i < size; i++) {
			pascalTriangle[i][0] = pascalTriangle[i][i] = 1;
			int j = 0;
			while(++j < i){
				pascalTriangle[i][j] = pascalTriangle[i-1][j-1] + pascalTriangle[i-1][j];
			}
		}
		return pascalTriangle;
	}
	public static void main(String[] args) {
		int[][] a = pascal(10);
		for (int[] is : a) {
			for (int i : is) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
