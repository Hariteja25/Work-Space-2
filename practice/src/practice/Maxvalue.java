package practice;

public class Maxvalue {
	public static void main(String[] args) {
		int ar[]= {8,3,5,4,110,6};
		int max=ar[0];
		int smax=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>max) {
				smax=max;
				max=ar[i];
			
				
			}
			else if(ar[i]>smax){
				smax=ar[i];
			}
		}
		System.out.println(max);
		System.out.println(smax);
		
	}

}
