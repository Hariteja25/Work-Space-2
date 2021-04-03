package algorithm;


import java.util.Arrays;

public class Print {
	
	static void printMissing(int arr[], int low,int high)
	{
		boolean[] br = new boolean[high - low + 1];
		
		for (int i = 0; i < arr.length; i++) {
			if (low <= arr[i] && arr[i] <= high)
				br[arr[i] - low] = true;
		}
		
		
		for (int x = 0; x <= high - low; x++) {
			if (br[x] == false)
				System.out.print((low + x) + " ");
		}
	}

	public static void main(String[] args)
	{
		int arr[] = {2, 5, 6, 4 };
		int low = 1, high = 10;
		printMissing(arr, low, high);
	}
}

