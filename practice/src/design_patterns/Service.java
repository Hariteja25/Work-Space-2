package design_patterns;

public final class Service{

private static Service serviceObj = null;

private Service(){


}


public static Service getServiceObj(){
if(serviceObj==null){
serviceObj = new Service();
}
return serviceObj;
}


}


