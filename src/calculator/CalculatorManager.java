package calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorManager {
	

	public Calculator cal = new Calculator(a, b);
	public static int a =12;
	public static int b =4;
	
   @Test
   public void verifyAdd() {
	 Assert.assertEquals(cal.add(), 16);
	}
   
   @Test
   public void verifyDiv() {
	   Assert.assertEquals(cal.div(), 3);
   }
   @Test
   public void verifyMul() {
	   Assert.assertEquals(cal.mul(), 48);
   }
   @Test
   public void verifyRem() {
	   Assert.assertEquals(cal.rem(), 0);
   }
  

}
