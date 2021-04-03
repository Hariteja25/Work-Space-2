package practice;

public class bubblesort {
	public static void main(String[] args) {
		
		
		
		int ar[]= {1,5,7,2,3,9,8,4,6};
		for(int i=0;i<ar.length-2;i++) {
			int temp;
			for(int j=0;j<ar.length-2;j++) {
				if(ar[j]>ar[j+1]) {
					temp=ar[j+1];
					ar[j+1]=ar[j];
					ar[j]=temp;
				}
			}
		}
		
		
		for(int d:ar) {
			System.out.println(d);
		}
		
	}

}
