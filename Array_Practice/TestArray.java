package Array_Practice;

import java.util.Scanner;

public class TestArray {
	public static void main(String[] args)
	{
		int[] arr=new int[5];
		
		ArrayService.AcceptValue(arr);
		ArrayService.DisplayValue(arr);
		
		ArrayService.SearchNumber(arr);
        ArrayService.Sumarray(arr);
        ArrayService.SumOfEvenNos(arr);
	}

}