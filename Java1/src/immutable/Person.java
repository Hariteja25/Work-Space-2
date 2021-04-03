package immutable;
/*
 Immutable class:
----------------
String objs are immutable .
the obj once created with data cannot be altered.
i.e. once obj is instantiated the state cannot be changed.

mutable obj : state/values can be changed.
immutable obj : state/values cannot be changed.


Steps for creating the immutable class:
---------------------------------------------------------
1. create a public final class
2.make the instance variables as private final.
3.provide only parameterized constructr
4.provide only getters methods ; dont writeany setter methods

ex: 
1.for execption obj
2.read data from source [db/file/external]and we dont want the data to be altered.

final class cannot be extended. [ if a class is final, then child class cannot be created ]
final method cannot be overridden[ overriding is not possible ]
final variable cannot be changed. [variable once created , cannot be changed]

 */

public final class Person {
	
	private final int id;
	private final String name;
	private final int age;
	
	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
