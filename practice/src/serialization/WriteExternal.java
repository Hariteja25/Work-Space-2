package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteExternal {
public static void main(String[] args) {
Person p1 = new Person("Kumar", 2000);

try {
FileOutputStream fo = new FileOutputStream("test.txt");
ObjectOutputStream so = new ObjectOutputStream(fo);
so.writeObject(p1);
so.flush();
}
catch (Exception e) {
System.out.println(e);
}
}

}