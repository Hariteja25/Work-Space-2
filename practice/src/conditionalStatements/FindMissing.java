package conditionalStatements;

public class FindMissing {
	public static void main(String[] args) {
		
		int ar[]= {1,4,6,9};
		for(int i=1;i<=ar.length;i++) {
			boolean available=false;
			for(int j=0;j<ar.length-1;j++) {
				if(i==ar[j]) {
					available=true;
					break;
				}
			}
			if(!available) {
				System.out.println(i);
				break;
			}
		}
	}

}
