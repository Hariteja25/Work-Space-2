package serialization;


import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadExternal {
public static void main(String[] args) {
Person p2 = null;
try {
FileInputStream fi = new FileInputStream("test.txt");
ObjectInputStream si = new ObjectInputStream(fi);
p2 = (Person) si.readObject();
} catch (Exception e) {
System.out.println(e);
}
System.out.println("Data = " + p2);
}


}