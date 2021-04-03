package innerClasses;

public class LocalInner {

	public void display() {
		
    //inner clas start
		class Local {
			void msg() {
				System.out.println("helloo");
			}
		}
		//inner clas end
    
		Local l = new Local();
		l.msg();
	}

}