package TestCases;

import org.testng.annotations.Test;

import Core.LoginPage;
import Core.TestCore;
import Core.searchset;

public class TestAddSets extends TestCore {
	
	@Test
	public void addset() throws InterruptedException{
		
		LoginPage lp = new LoginPage(driver);
		lp.login();
		searchset ss = new searchset(driver);
		ss.addsets();
	}

}
