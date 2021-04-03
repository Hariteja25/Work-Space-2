package practice;

import java.util.Arrays;

public class Cloning {
	
  public static void main(String[] args) {
	int ar[]= {1,2,3,4,5};
	
	int br[]=ar.clone();
	
	
	for(int b:br) {
		System.out.println(b);
	}
	
	System.out.println(Arrays.equals(ar, br));
	
}

}
