package test.cal;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

public class PositiveTestCase extends BasicCalTest {
	
	@Test(groups="sum")
	public void plusLong() throws InterruptedException{
		Thread.sleep(1*1000);
		checkTime();
		long result = cal.sum(1,2);
		Assert.assertEquals(result, 3, "Invalid result of plusLong");
		
	}
	@Test(dataProvider="sumDp",groups="sum")
	public void plusDouble(double a, double b, double expected) throws InterruptedException{
		Thread.sleep(1*1000);
		checkTime();
		double result = cal.sum(a, b);
		Assert.assertEquals(result, expected, "Invalid result of plusDouble");		
	}
	@DataProvider(name="sumDp")
	public Object[][] dataProvider(){
		return new Object[][]{
				{1.5,2.4,3.9},
				{1.0,2.6,3.6},
				{9,6,15},
				{1.0,5.0,6}
		};
	}
	
	@Test
	public void subLong() throws InterruptedException{
		Thread.sleep(1*1000);
		checkTime();
		long result = cal.sub(5, 7);
		Assert.assertEquals(result, -2, "Invalid result of plusDouble");		
	}

}
