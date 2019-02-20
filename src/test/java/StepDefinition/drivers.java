package StepDefinition;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class drivers {
	 WebDriver driver;
	 static WebDriver driver1; 
	public static WebDriver setupDriver()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium_WS\\geckodriver.exe");
		DesiredCapabilities capabilities = new DesiredCapabilities();

		 capabilities = DesiredCapabilities.firefox();
		 capabilities.setBrowserName("firefox");
		 capabilities.setVersion("your firefox version");
		 capabilities.setPlatform(Platform.WINDOWS);
		 capabilities.setCapability("marionette", false);
		 drivers d = new drivers();
		 d.driver = new FirefoxDriver(capabilities);
		 driver1= d.driver;
		return d.driver;
	}

	public static void closebrowser() {
		// TODO Auto-generated method stub
		driver1.close();
	}
}
