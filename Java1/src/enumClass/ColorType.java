package enumClass;

public enum ColorType {

	BLUE,
	RED,
	BLACK,
	GREEN,
	WHITE,
	YELLOW,
	BROWN;
	
	 public static boolean isValidColor(String input) {
			ColorType[] objs = ColorType.values();// get all objs
		
			boolean found= false;
			for(ColorType obj :objs) { // compare input with each color
				if(input.equals(obj.toString())) {
					found= true;
					break;
				}
			}
			return found;
		}
	  
	
  
}
  
  