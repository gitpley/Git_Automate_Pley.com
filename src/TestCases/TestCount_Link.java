package TestCases;

import org.testng.annotations.Test;

import Core.Count_Link;
import Core.TestCore;

public class TestCount_Link extends TestCore {
	
	@Test
	 public void Count200() throws InterruptedException{
		Count_Link cl = new Count_Link(driver);
		 cl.numberOfLinks();
		 cl.printLinks();
		 cl.checkAllLinks();
	}
	

}
