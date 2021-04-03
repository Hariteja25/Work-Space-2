package annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class ReadAnnotationValue {

	public static int getDeclaredSize(String className,String fieldName) throws ClassNotFoundException, NoSuchFieldException {
		Class c = Class.forName(className);
		Field field = c.getDeclaredField(fieldName);
		Annotation[] annotations = field.getDeclaredAnnotations();

		int size = -1;
		for (Annotation annotation : annotations) {
			if (annotation instanceof Size) {
				Size myAnnotation = (Size) annotation;
				size = myAnnotation.value();
			}
		}
		return size;
	}
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {

		System.out.println("Person.id --> "+ReadAnnotationValue.getDeclaredSize("annotations.field.Person", "id"));
		System.out.println("Person.name --> "+ReadAnnotationValue.getDeclaredSize("annotations.field.Person", "name"));
		System.out.println("User.pan --> "+ReadAnnotationValue.getDeclaredSize("annotations.field.User", "pan"));
		//System.out.println("Product.productId --> "+ReadAnnotationValue.getDeclaredSize("annotations.field.Product", "productId"));
		
	}
}




