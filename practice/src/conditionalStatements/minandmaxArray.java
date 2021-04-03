package conditionalStatements;

public class minandmaxArray {
	public static void main(String[] args) {
		
		int ar[]= {8,2,5,3,6,1,3,0,8,9};
		int min = 0,max=0;
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<min) {
				
				min=ar[i];
			}
			
			if(ar[i]>max) {
				
				max=ar[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
		
	}

}
