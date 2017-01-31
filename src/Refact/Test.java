package Refact;

/*public class Test {
	  private int low, high;
	 
	  boolean includes(final int arg) {
	    return arg >= low && arg <= high;
	  }
	}*/

public class Test {
	  private int low, high;
	 
	  boolean includes(final int arg) {
	    return arg >= getLow() && arg <= getHigh();
	  }

	private int getLow() {
		return low;
	}

	private void setLow(int low) {
		this.low = low;
	}

	private int getHigh() {
		return high;
	}

	private void setHight(int high) {
		this.high = high;
	}
	}
