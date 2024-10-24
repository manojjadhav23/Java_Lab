package com.demo.test;

import java.util.Scanner;

public class TestBinarySearch {
	public static void main(String[] args) {
		int []arr = {5,8,20,60,80};
		
		Scanner sc = new Scanner(System.in);
		String s= null;
		do {
		System.out.println("Enter Number to Search:");
		int n=sc.nextInt();
		int pos=BinarySearch(arr,0,arr.length-1,n);
		if(pos!=-1)
			System.out.println("Number Found at:"+pos);
		else
			System.out.println("Number not Found");
		System.out.println("Do you what to Contiune(y/n)");
		 s=sc.next();
		 
		}while(s.equals("y"));
	}

	private static int BinarySearch(int[] arr, int low, int high, int n) {
		if(low<=high) {
			int mid = (low+high)/2;
			
			if(arr[mid]==n)
				return mid;
			else if(arr[mid]<n)
				return BinarySearch(arr,mid+1,high,n);
			else if(arr[mid]>n)
				return BinarySearch(arr,low,mid-1,n);
		}
		return -1;
		
	}
}
