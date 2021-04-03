package polymorphism;

public class TestData {
	public static void main(String[] args) {
		 
		Data d = new Data();
		
		d.save("kumar");
		
		Person p = new Person();
		d.save(p);
		/*
Data data = new Data();
		
		// can we call save method by passing null?????
		data.save(null);
		
		//this will give compilation
		// compiler is confused which method to call..
		Person p = null;
		String s = null;
		
		
		data.save(p);
		data.save(s);
		
		*/
		
 	}
}
