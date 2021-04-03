package collections.arrays;
/*
 Create a int array of size 5 and perform
 - Insert
 - Read by position
 - Read all
 */

public class TestIntArrays {
	public static void main(String[] args) {
		
	 	int[] numbers = new int[5];// create int arrayof size 5
		
		//Insert from position 0 TO position 4
		numbers[0]=12;
		numbers[1]=98;
		numbers[2]=15;
		numbers[3]=14;
		numbers[4]=34;
		
		
		//read by position
		System.out.println("********** Read by position **************");
		System.out.println(numbers[0]);  
		System.out.println(numbers[1]);  
		System.out.println(numbers[2]);  
		System.out.println(numbers[3]);  
		System.out.println(numbers[4]);  
		
		
		//Read all using enhanced for loop
		System.out.println("********** Read all elements **************");
		for(int x : numbers) {
			System.out.println(x);
		}
	}

}
