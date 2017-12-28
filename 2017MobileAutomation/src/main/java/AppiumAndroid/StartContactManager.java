package AppiumAndroid;


 
import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
 
public class StartContactManager {
 
		private static AndroidDriver driver;
		public static void main(String[] args) throws MalformedURLException, InterruptedException {
 
			File classpathRoot = new File(System.getProperty("user.dir"));
			File appDir = new File(classpathRoot, "/Apps/");
			File app = new File(appDir, "ContactManager.apk");
 
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			capabilities.setCapability("deviceName", "5554");
			capabilities.setCapability("platformVersion", "6.0");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("app", app.getAbsolutePath());
			capabilities.setCapability("appPackage", "com.example.android.contactmanager");
			capabilities.setCapability("appActivity", "com.example.android.contactmanager.ContactManager");
		
 
			driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			
			//ByName---text value
			//WebElement elementTextSignin = driver.findElementByName("Add Contact");
			driver.findElementByName("Add Contact");
		  
			//ByName---content-desc value---same with text value
			//driver.findElement(By.name("Add Contact"));
			
			//ByClassName---class value
			driver.findElement(By.className("android.widget.Button"));
			
			//ByID---resource-id value
			driver.findElement(By.id("com.example.android.contactmanager:id/addContactButton")).click();
			
			//ByXpath
			driver.findElementByXPath("//android.widget.TextView[@content-desc='Contact Name']");
			System.out.println(driver.findElementsByXPath("//android.widget.TableRow/android.widget.EditText").size());
			System.out.println(driver.findElementsByXPath("//android.widget.TextView[@content-desc='Contact Name']/following-sibling::android.widget.TableRow").size());
			
			
			//Thread.sleep(10000);
			//driver.quit();
 
	}
 
}