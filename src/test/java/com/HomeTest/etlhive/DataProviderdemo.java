package com.HomeTest.etlhive;

import org.testng.annotations.DataProvider;

public class DataProviderdemo {
	@DataProvider(name="testData")
	
	public static Object[][] getDatafromhere(){
	return new Object[][] {
		{"http://the-internet.herokuapp.com/iframe", "iframe Test"},
		

	};
	
}
}

