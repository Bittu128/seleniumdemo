package StepDefinition;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import PageFactory.*;

public class loginPagestep extends drivers {
	
	private  WebDriver driver = super.setupDriver();
	LogInPage logIn =new LogInPage(driver);

	public static void launchUrl(String Url) {
		// TODO Auto-generated method stub
		loginPagestep l = new loginPagestep();
		l.driver.manage().window().maximize();
		l.driver.get("http://demo.guru99.com/v4");
		l.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void EnterUser(String username) {
		// TODO Auto-generated method stub
		LogInPage.userName.click();
		LogInPage.userName.sendKeys(username);
		
	}

	public static void EnterPass(String password) {
		// TODO Auto-generated method stub
		LogInPage.passWord.click();
		LogInPage.passWord.sendKeys(password);
		
	}

	public static void clickResetbtn() {
		// TODO Auto-generated method stub
		LogInPage.reSet.click();
	}
	}
