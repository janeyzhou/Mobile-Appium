package AppiumAndroid;


 
import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
 
public class StartAmazonApp {
 
		private static AndroidDriver driver;
		public static void main(String[] args) throws MalformedURLException, InterruptedException {
 
			File classpathRoot = new File(System.getProperty("user.dir"));
			File appDir = new File(classpathRoot, "/Apps/");
			File app = new File(appDir, "Amazon_App.apk");
 
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			capabilities.setCapability("deviceName", "5554");
			capabilities.setCapability("platformVersion", "6.0");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("app", app.getAbsolutePath());
			capabilities.setCapability("appPackage", "com.amazon.venezia");
			capabilities.setCapability("appActivity", "com.amazon.venezia.AppstoreReactNativeActivity");
		
 
			driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			
			//ByName---text value
			//WebElement elementTextSignin = driver.findElementByName("Already an Amazon customer? Sign In");
			driver.findElement(By.name("Already an Amazon customer? Sign In"));
			
		/*	//ByName---content-desc value---same with text value
			driver.findElement(By.name("xxx"));
			
			//ByClassName---class value
			driver.findElement(By.className("android.view.ViewGroup"));
			
			//ByID---resource-id value
			driver.findElement(By.id("xxx"));*/
			
			//ByXpath
			//driver.findElementByXPath("//android.view.View[@text-'Already an Amazon customer? Sign In']");
			
			//Thread.sleep(10000);
			//driver.quit();
 
	}
 
}