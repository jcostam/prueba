package Refact;

public class Person {
	  private String _name;
	  private TelephoneNumber _telephoneNumber = new TelephoneNumber();
	  	 
	  public String getTelephoneNumber() {
		    return ("(" + _telephoneNumber.get_officeAreaCode() + ") " + _telephoneNumber.get_officeNumber());
		  }
	  
	 
	  // GETTERS AND SETTERS
	 
	  public String getName() {
	    return _name;
	  }
	 

	}
