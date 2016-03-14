package test.cal;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class NegativeTestCase extends BasicCalTest {
	
	@Test(dataProvider="divDp", groups="div")
	public void divLong(long a, long b, long expected){
		long result = cal.div(a, b);
		Assert.assertEquals(result, expected, "Invalid result of divLong");
		
	}
	@DataProvider(name="divDp")
	public Object[][] dataProvider(){
		return new Object[][] {
				{7,2,3.5},	
				{4,0,0}
		};
	}
	
	@Test(dataProvider="divDp", groups="div")
	public void divDouble(double a, double b, double expected){
		double result = cal.div(a, b);
		Assert.assertEquals(result, expected, "Invalid result of divLong");
		
	}
	
	@Test
	public void powDouble(){
		double result = cal.pow(2, 5.9);
		Assert.assertEquals(result, 32.0, "Invalid result of plusDouble");		
	}
	
	@Test(groups="div1")
	public void multDouble(){
		double result = cal.mult(2.1, 3.0);
		Assert.assertEquals(result, 6.3, "Invalid result of plusDouble");		
	}
	@Test
	public void isNegativecheck(){
		boolean result = cal.isNegative(-0);
		Assert.assertEquals(result, false, "Invalid result of plusDouble");		

	}

	
	@AfterClass()
	public void endTesting(){
		System.out.println("Current end test time: " + new Date(System.currentTimeMillis()));
	}

}
