package serialization;


import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Deserialize{


public static void main(String args[]) throws Exception {

File file = new File("E:\\Doubts Session\\Files\\serialized.txt");

FileInputStream fis = new FileInputStream(file);

ObjectInputStream in = new ObjectInputStream(fis);

Student st = ( Student ) in.readObject();
System.out.println("id ="+st.id + " , name = " + st.name);
System.out.println("refNo ="+st.refNo );
in.close();

}

}