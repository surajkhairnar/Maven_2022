package com.mycompany.app;

import org.testng.annotations.DataProvider;

public class DataPBaseTestB {
	@DataProvider
	  public Object[][] BookStore() {
	    return new Object[][] {
	      new Object[] { "ravi.nangare", "Qwerty@123" },
	      new Object[] { "ravi.nangare1", "Qwerty@123" },
	      new Object[] { "ravi.nangre", "Qwerty@123" },
	    };

}
}
