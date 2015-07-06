package com.nonefly.sort;


/**
 * 快速排序
 * @author nonefly
 * Jul 2, 2015
 */
public class Quick {
	
	public static void sort(int[] a){
		sort(a, 0, a.length);
	}
	
	private static void sort(int[] a, int low, int high){
		//两个元素时不排序
		if(high - low < 2)
			return;
		int m = partition2(a, low, high);
		sort(a, low, m);
		sort(a, m+1, high);
	}
	/**
	 * 以数组尾为轴
	 * @param a 待排序数组
	 * @param low 起始
	 * @param high 结尾
	 * @return
	 */
	private static int partition(int[] a, int low, int high){
		//int[] a = {3,42,2,4,2,5,27}
		int  pivot = a[low], i = low, j = high;
		while(i < j){
			//注意与以开始为轴元素寻找的区别
			while(i < j && a[--j] >= pivot);//从末尾找到一个比轴数字（pivot）小的
			if(i < j)
				a[i] = a[j];
			while(i < j && a[++i] <= pivot);//从开始找到一个比轴数字（pivot）大的
			if(i < j)
				a[j] = a[i];
		}
		a[j] = pivot;
		return j;
	}
	
	/**
	 * 以数组头为轴元素
	 * @param a 待排序数组
	 * @param low 起始
	 * @param high 结尾
	 * @return
	 */
	private static int partition2(int[] a, int low, int high){
		//注意a[--high]而a[high-1]则不可，因为后者未改变high值，再之后使用会数组越界
		int pivot = a[--high], i = low, j = high;
		while(i < j ){
			while(i < j && a[i++] <= pivot);//从开始找到一个比轴数字（pivot）大的
			if(i < j)
				//上循环i结束后会多+1，此处应该减去
				a[j] = a[--i];
			while(i < j && a[--j] >= pivot);//从末尾找到一个比轴数字（pivot）小的
			if(i < j)
				a[i] = a[j];
		}
		a[j] = pivot;
		return j;
	}
}
