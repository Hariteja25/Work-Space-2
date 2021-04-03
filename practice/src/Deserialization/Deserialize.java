package Deserialization;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Deserialize{


public static void main(String args[]) throws Exception {

String  file = "E:\\\\Doubts Session\\\\Files\\\\serialized.txt";

FileInputStream fis = new FileInputStream(file);

ObjectInputStream in = new ObjectInputStream(fis);

Student s = ( Student ) in.readObject();
System.out.println("id ="+s.id + " , name = " + s.name);
System.out.println("refNo ="+s.refNo );
in.close();

}

}