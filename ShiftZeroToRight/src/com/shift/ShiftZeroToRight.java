package com.shift;

import java.util.Arrays;

public class ShiftZeroToRight {
	
	void shiftToRight(int[] arr) {
		
		
		int n=arr.length;
		
		
		int count=0;
		
		
		for(int i=0;i<n;i++) {
			
			if(arr[i]!=0) {
				arr[count++]=arr[i];
			}
		}
		
		
		while(count<n) {
			arr[count++]=0;
			
			
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		
		int[] a= {1,0,2,0,3,0,4,5,0,0,6};
		System.out.println("Before shifting");
		
		System.out.println(Arrays.toString(a));
		
		ShiftZeroToRight shiftZeroToRight=new ShiftZeroToRight();
		System.out.println("After shifting");
		shiftZeroToRight.shiftToRight(a);
		System.out.println(Arrays.toString(a));
		
	}

}
