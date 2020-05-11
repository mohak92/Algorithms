package com.mohak.sorting;

import java.util.Random;

public class MergeSort {
	
	private int[] nums;
	private int[] tempArray;
	
	public MergeSort(int[] nums) {
		this.nums = nums;
		this.tempArray = new int[nums.length];	
	}
	
	public void mergeSort(int low, int high) {
		if(low >= high) {
			return;
		}
		
		int middle = (low + high)/2;
		
		mergeSort(low, middle);
		mergeSort(middle+1,high);
		merge(low,middle, high);
	}

	private void merge(int low, int middle, int high) {
		
		//Copy nums[i] -> temp[i]
		for(int i = low;i <= high;i++) {
			tempArray[i] = nums[i];
		}
		
		int i = low;
		int j = middle + 1;
		int k = low;
		
		//Copy the smallest values from either the left or the right side
		//to the original array
		while((i <= middle) && (j <= high)) {
			if(tempArray[i] <= tempArray[j]) {
				nums[k] = tempArray[i];
				i++;
			} else {
				nums[k] = tempArray[j];
				j++;
			}
			
			k++;
		}
		
		//copy the remaining left side of the array into target array
		while(i <= middle) {
			nums[k] = tempArray[i];
			k++;
			i++;
		}
		
		//copy the remaining right side of the array into target array
		while(j <= high) {
			nums[k] = tempArray[j];
			k++;
			j++;
		}
	}
	
	public void showArray() {
		for(int i = 0;i <nums.length;i++)
			System.out.print(nums[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		Random random = new Random();
		int[] nums = new int[10];
		
		for(int i = 0; i < nums.length;i++)
			nums[i] = random.nextInt(1000) - 500;
		
		//O(NlogN)
		MergeSort mergeSort = new MergeSort(nums);
		mergeSort.showArray();
		mergeSort.mergeSort(0, nums.length-1);
		System.out.println("Sorted Array");
		mergeSort.showArray();
	}

}
