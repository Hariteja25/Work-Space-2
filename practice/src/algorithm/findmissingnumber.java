package algorithm;

public class findmissingnumber {

	public static void main(String[] args) {
	
		
		int ar[]= {1,6,6,3,6,9,5,4,5,6};
		int[] def = new int[ar.length];
		
		for (int i : ar) 
		{
			def[i] = 1;
		}	
		
		for (int i = 1; i <def.length; i++)
		{ 
			if (def[i] == 0) 
			{
				System.out.println(i); 
			} 
			
		}

	}

}
