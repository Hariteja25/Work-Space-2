package annotations;
/*
 Req:
validate the id for Person , pan for User , productId for Product

 1. Create the annotation                     -> Framework
2.Apply the annotations for Person , User , Product:       -> Developer
3.Read the annotation Values         -> Framework
 Use the Reflection API
 using the class get the annotation value
4.Validate the data with the annotated size      -> Framework

 */

public class TestField {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		String pId = "1234";
		String userPan = "testpan";
		
		Person p = new Person(pId);
		User u = new User(userPan);
		
		// get the annotation value 
		int s1 = ReadAnnotationValue.getDeclaredSize("annotations.Person","id");
		int s2 = ReadAnnotationValue.getDeclaredSize("annotations.User","pan");
		
		validate(p.getId(),s1);
		validate(u.getPan(),s2);
	}

	private static void validate(String value, int size) {
		if(value.length()<size){
			System.out.println("Invalid size for ::"+value);
		}else{
			System.out.println("valid size for ::"+value);
		}
	}

}








