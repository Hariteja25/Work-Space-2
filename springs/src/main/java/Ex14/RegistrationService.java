package Ex14;
/*
 scopes:
--------------

 1.singleton -> one bean obj for the bean class
  2.prototype -> create bean obj everytime when getBean() method is called.
  3.request   -> web  , one bean obj per reuqest
  4.session  -> web  , one bean obj per user/session
  5.global-session -> web , one bean obj per application.
  

how to specify bean:
a) in springs.xml along with bean tag provide the scope attribute
<bean id="uService" class="scopes.UserService" scope="singleton"/>
<bean id="uService" class="scopes.UserService" scope="prototype"/>
<bean id="uService" class="scopes.UserService" scope="request"/>
<bean id="uService" class="scopes.UserService" scope="session"/>
<bean id="uService" class="scopes.UserService" scope="global-session"/>
	
 */

/*
Req:
for RegistrationService provide scope as singleton
for UserService provide scope as prototype
exhibit the behaviour of getBean() method
*/
public class RegistrationService {

	 String propName;

	public RegistrationService(String propName) {
		super();
		this.propName = propName;
	}

	public String getPropName() {
  
  
		return propName;
	}
}
