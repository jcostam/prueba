package Refact;

public class discount {
	private int _quantity;

	int getRating() {
		  return (moreThanFiveLateDeliveries()) ? 2 : 1;
		}
		 
		boolean moreThanFiveLateDeliveries() {
		  int _numberOfLateDeliveries = 0;
		return _numberOfLateDeliveries > 5;
		}
		
	public void discount(int inputVal, final int quantity, final int yearToDate) {
		  
		
		if (inputVal > 50) {
		    inputVal -= 2;
		  }
		  // do something
		}
	
	public void test() {
		String platform, browser;
		boolean isMacOs = platform.toUpperCase().indexOf("MAC") > -1;
		boolean isIEBrowser = browser.toUpperCase().indexOf("IE") > -1;
		boolean wasResized = resize > 0;
		if (isMacOs && isIEBrowser && wasInitialized() && wasResized ) {
		    // do something
		  }
		}
	
	public double test2() {
		_quantity = 0;
		int _itemPrice = 0;
		if ((double) basePrice(_quantity, _itemPrice) > 1000) {
		    return basePrice(_quantity, _itemPrice) * 0.95;
		  } else {
		    return basePrice(_quantity, _itemPrice) * 0.98;
		  }
		}

	private int basePrice(final int _quantity, final int _itemPrice) {
		return _quantity * _itemPrice;
	}
	public void printAmount() {
		  int amount = DEFAULT_AMOUNT;
		  amount = GetAmount(amount);
		  printDetails(amount);
		}

	private int GetAmount(int amount){for (Integer integer : list) {
	    amount += integer;
	  }return amount;}
}
