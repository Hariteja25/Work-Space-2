package conditionalStatements;

import java.util.Arrays;

public class unqElemArray {
	public static void main(String[] args) {
		
		int ar[]= {2,5,3,4,6,6,3,3,3,7,2,4,5,7};
		for(int i=0;i<ar.length;i++) {
			
			int temp=0;
			for(int j=0;j<ar.length;j++) {
				if(ar[i]<ar[j]) {
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
			
		}
		/*
		 * for(int i=0;i<ar.length;i++) { System.out.print(ar[i]+" "); }
		 */
	
		
		//Arrays.sort(ar);
		int j=0;
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i]!=ar[i+1]) {
				ar[j]=ar[i];
				j++;
			}
		}
		ar[j]=ar[ar.length-1];
		
		for(int i=0;i<=j;i++) {
			System.out.print(ar[i]+" ");
		}
	}

}
