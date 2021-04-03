package polymorphism;
/*
 Employee has 
id, fname , lname , pfno , ppfno  +
3 addresses
1.street , city , state , country , pin for permannet address
2.street , city , state , country , pin for present address
3.street , city , state , country , pin for ofice address
 */

public class Employee {
	int id;
	String fname;
	String lname;
	int pfno;
	int ppfno;
	String pstreet;
	String pcity;
	String pstate;
	String pcountry;
	int ppin;
	String prstreet;
	String prcity;
	String prstate;
	String prcountry;
	int prpin;
	String ostreet;
	String ocity;
	String ostate;
	String ocountry;
	int opin;
	public Employee(int id, String fname, String lname, int pfno, int ppfno, 
			String pstreet, String pcity,String pstate, String pcountry, int ppin,
			String prstreet, String prcity, String prstate, String prcountry,
		int prpin, String ostreet, String ocity, String ostate, String ocountry,
		int opin) {
		
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.pfno = pfno;
		this.ppfno = ppfno;
		this.pstreet = pstreet;
		this.pcity = pcity;
		this.pstate = pstate;
		this.pcountry = pcountry;
		this.ppin = ppin;
		this.prstreet = prstreet;
		this.prcity = prcity;
		this.prstate = prstate;
		this.prcountry = prcountry;
		this.prpin = prpin;
		this.ostreet = ostreet;
		this.ocity = ocity;
		this.ostate = ostate;
		this.ocountry = ocountry;
		this.opin = opin;
	}
	public void display() {
		System.out.println(id);
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(pfno);
		System.out.println(ppfno);
		System.out.println(pstreet);
		System.out.println(pcity);
		System.out.println(pstate);
		System.out.println(pcountry);
		System.out.println(ppin);
		System.out.println(prstreet);
		System.out.println(prcity);
		System.out.println(prstate);
		System.out.println(prcountry);
		System.out.println(prpin);
		System.out.println(ostreet);
		System.out.println(ocity);
		System.out.println(ostate);
		System.out.println(ocountry);
		System.out.println(opin);
	}
	
	

}
