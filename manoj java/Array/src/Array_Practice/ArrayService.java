package Array_Practice;

import java.util.Scanner;

public class ArrayService {

	public static void AcceptValue(int[] arr) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the value");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
	}

	public static void DisplayValue(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println("array element:"+i+" :"+arr[i]);
		}
		
		
	}

	public static int SearchNumber(int[] arr) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for search:");
		int s=sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			if(s==arr[i]) {
				System.out.println("array element is found at: "+i);
				return i;
			}
		}
		System.out.println("Element is not found");
		return 0;
		
	}

	public static void Sumarray(int[] arr) {
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			
		}
		System.out.println("Array element sum"+sum);
		
	}

	public static void SumOfEvenNos(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("addition of array even no is:"+sum);
		
	}
	

}