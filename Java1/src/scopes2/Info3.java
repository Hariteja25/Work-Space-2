package scopes2;

import scopes1.Info;

public class Info3 {

	public void show(){
		//access everything within class
		Info i = new Info();
		System.out.println(i.id);
		//System.out.println(i.name); // private cannot be accessed outside the class.
		//System.out.println(i.age); // protected cannot be accessed outside the pkg
		//System.out.println(i.count); // default cannot be accessed outside the pkg
	}
	
}

