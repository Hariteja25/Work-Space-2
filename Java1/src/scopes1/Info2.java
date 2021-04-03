package scopes1;

public class Info2 {

	public void show(){
		//access everything within class
		Info i = new Info();
		System.out.println(i.id);
      //System.out.println(i.name); // private cannot be accessed outside the class.
		System.out.println(i.age);
		System.out.println(i.count);
	}
	
}

