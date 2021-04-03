package practice;
import java.util.Collections;
import java.util.List;
 
public class MyEmptyList {
 
    public static void main(String a[]){
         
        List<String> li = Collections.<String>emptyList();
        System.out.println("Empty list: "+li);
    }
}