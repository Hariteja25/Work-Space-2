package conditionalStatements;

public class uniqarray {
	public static void main(String[] args) {
		int ar[]= {2,9,8,7,3,4,2,2,3,1,4,99,2};
		for(int i=0;i<ar.length;i++) {
			int count=1;
			for(int j=0;j<ar.length;j++) {
				if(ar[i]==ar[j]&&i!=j) {
					count++;
					break;
				}
			}
			if(count==1) {
				System.out.print(ar[i]+" ");
			}
		}
	}

}
