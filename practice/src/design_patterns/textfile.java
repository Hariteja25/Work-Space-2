package design_patterns;
/*
 * Singleton: ---------------- -> design pattern to ensure only one object is
 * created for one class.
 * 
 * use when the action/task has to be perofmed only once.
 * 
 * where? ----------- 1.Read a csv file 2.Read propeties file 3.Get the
 * connection objs from db ex:SessionFactory 4.Read springs.xml
 * 
 * 
 * steps: ----------- 1.make class textfile final 2.make the constr as private
 * 3.dont provide any setter methods 4.provide only getters 5.instance variables
 * has to be final 6.provide the public static method to get the Obj
 * 
 */