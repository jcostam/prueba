package Refact;

public class AccountType {

	public boolean isPremium() {
		// TODO Apéndice de método generado automáticamente
		return false;
	}

	double overdraftCharge(Acount acount) {
	    if (acount.get_type().isPremium()) {
	      double result = 10;
	      if (acount.get_daysOverdrawn() > 7) {
	        result += (acount.get_daysOverdrawn() - 7) * 0.85;
	      }
	      return result;
	    } else {
	      return acount.get_daysOverdrawn() * 1.75;
	    }
	  }

}
