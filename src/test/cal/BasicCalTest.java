package test.cal;



import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import java.util.Date;

import com.epam.tat.module4.Calculator;



public class BasicCalTest {
	
	Calculator cal;


	@BeforeClass()
	public void setUp(){
		cal = new Calculator();
		System.out.println("Config calculator");
	}
	
	public void checkTime(){
		System.out.println("Current time: " + new Date(System.currentTimeMillis()));
	}


}
