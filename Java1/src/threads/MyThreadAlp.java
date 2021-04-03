package threads;
/*
 Req:
 Display every char in a string with a delay of 250 ms
 */

public class MyThreadAlp extends Thread {
	public static void main(String args[]) {
		String data = "Java is a programming language";
		
		Runnable  r = () -> {
			
			for (char ch:  data.toCharArray()) {
				System.out.print(ch);
				try {
					Thread.sleep(250);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println();
		};
		
		Thread  th1 = new Thread(r);
		th1.start();
	}
}
   
