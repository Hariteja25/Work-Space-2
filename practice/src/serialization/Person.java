package serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Person implements Externalizable{
int id;
String name;
static int age;


public Person() {
System.out.println("Default Constructor ");
}

public Person(String name, int id) {
this.name = name;
this.id = id;
age = 10;
}


@Override
public void writeExternal(ObjectOutput out) throws IOException {
out.writeObject(name);
out.writeInt(age);
out.writeInt(id);
}

@Override
public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
name = (String) in.readObject();
age = in.readInt();
id = in.readInt();
}

@Override
public String toString() {
return ("Name: " + name + "\n" + "Id: " + id + "\n" + "Age: " + age);
}

}
