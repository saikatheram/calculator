package calculator;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Sub_method {

	public static int x =10;
	public static int y =4;
	Calculator cal = new Calculator(x, y);
	
	@Test
	public void verifysubMethod() {
		System.out.println(" Welcome to review comments");
	  Assert.assertEquals(cal.sub(), 6);	
	}
	
	@AfterClass
	public void getmsg() {
		System.out.println("all methods are verified");
	}
	@BeforeClass
	public void setup() {
		System.out.println("set up was done");
	}
	

}
