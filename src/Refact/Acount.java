package Refact;

public class Acount {
	  private AccountType _type;
	  private int _daysOverdrawn;
	 
	  double bankCharge() {
	    double result = 4.5;
	    if (get_daysOverdrawn() > 0) {
	      result += _type.overdraftCharge(this);
	    }
	    return result;
	  }

	AccountType get_type() {
		return _type;
	}

	private void set_type(AccountType _type) {
		this._type = _type;
	}

	int get_daysOverdrawn() {
		return _daysOverdrawn;
	}

	private void set_daysOverdrawn(int _daysOverdrawn) {
		this._daysOverdrawn = _daysOverdrawn;
	}
	}
