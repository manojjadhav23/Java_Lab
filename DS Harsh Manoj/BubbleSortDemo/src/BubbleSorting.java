import java.util.Arrays;

public class BubbleSorting {

	public static void main(String[] args) {
		int[] arr= {65,35,26,13,23,12,91};
		System.out.println("Array befor sorting:"+Arrays.toString(arr));
		
		BubbleSort(arr);
		
		System.out.println("Array After Sorting:"+Arrays.toString(arr));
	}

	private static void BubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		int temp=0;
		int swapcount=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<n-i;j++) {
				if(arr[j-1]>arr[j]) {
				temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				swapcount++;
				}
		
	}
			System.out.println("No of Iterations: "+(i+1)+"No of Swap: "+swapcount);
			System.out.println(Arrays.toString(arr));
			swapcount=0;
		}
	}
}
