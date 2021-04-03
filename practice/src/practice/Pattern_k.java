package practice;

public class Pattern_k {

	public static void main(String[] args) {
		
		
		int n=11;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j<=n/2-i||j<=-n/2+i||j>=n/2+i||j>=n+(n/2)-1-i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");}
				}
			System.out.println();
			}
		}

	}


