package serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Serialize{

public static void main(String args[]) throws Exception {
// create the student obj
Student s1 = new Student(5000, "user2", 1234);


// serialize the student obj
File f = new File("E:\\\\Doubts Session\\\\Files\\\\serialized.txt");

FileOutputStream fout = new FileOutputStream(f);

ObjectOutputStream out = new ObjectOutputStream(fout);

out.writeObject(s1);

out.flush();
System.out.println("success");


}
}