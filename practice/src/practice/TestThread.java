package practice;

public class TestThread  extends Thread{

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main thread starts");
		
		String s="Hai This is New Year 2021";
		Runnable r1 =()-> { 
			System.out.println(Thread.currentThread());
			
			for(char ch:s.toCharArray()) {
				System.out.print(ch+"");
				try {
					Thread.sleep(290);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			System.out.println();
		};
		
		Runnable r2 =()-> { System.out.println("Iam 2021 ");
		};
		
		
		
		
		
		Thread th1=new Thread(r1,"String thread");
		
		Thread th2=new Thread(r2,"year thread");
		
		th1.start();
		
		
		th1.join();
		th2.start();
		
		
	
		th2.join();
		
		
		System.out.println("Main thread ends ");
		
	}

}
