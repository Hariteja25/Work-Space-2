package design_patterns;


//approach2: locking mechanism
//to avoid second obj creation during the concurrency

public final class Service2 {

private static Service2 serviceObj = null;

private Service2() {

}

public static Service2 getServiceObj() {
if (serviceObj == null) {
synchronized (Service2.class) {
if (serviceObj == null) {
serviceObj = new Service2();
}

}

}
return serviceObj;
}

}






