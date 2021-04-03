package scopes1;

public class Info {

	public int id;
	private String name;
	protected int age;
	int count;
	
	public void show(){
		//access everything within class
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println(count);
	}
	
}
