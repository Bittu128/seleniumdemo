package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage{
	 public LogInPage(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	 }
	
	@FindBy(name="uid")
	public static WebElement userName;
	
	@FindBy(name="password")
	public static WebElement passWord;
	
	@FindBy(xpath=".//input[@value = 'LOGIN']")
	public  static WebElement logIn;
	
	@FindBy(xpath=".//input[@value = 'RESET']")
	public static WebElement reSet;
	
	@FindBy(xpath="//h2[contains(text(),'Guru99 Bank')]")
	public static WebElement loginPage;

}
