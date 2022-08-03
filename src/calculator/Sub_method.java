package calculator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class Sub_method {

	public static int x =10;
	public static int y =4;
	Calculator cal = new Calculator(x, y);
	@Test
	public void verifysubMethod() {
		
	  Assert.assertEquals(cal.sub(), 6);	
	}
}
