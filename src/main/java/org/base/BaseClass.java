package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {
	public static WebDriver driver;


	public static WebDriver browserLaunch(String browserName)  {
		switch(browserName) {
		case"Chrome":
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\MavenSampleProject30.06\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		break;
		
		case"Firefox":
		System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\eclipse-workspace\\MavenSampleProject30.06\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		break;	
		
		case"Ie":
		System.setProperty("webdriver.ie.driver","C:\\Users\\User\\eclipse-workspace\\MavenSampleProject30.06\\Drivers\\IEdriver.exe");
		driver=new InternetExplorerDriver();
		break;	
		
		
		case"Edge":
		System.setProperty("webdriver.edge.driver","C:\\Users\\User\\eclipse-workspace\\MavenSampleProject30.06\\Drivers\\msedgedriver.exe");
		driver=new EdgeDriver();
		break;	
			
		default:
			System.err.println("Invalid browser");
			break;

		}
		return driver;
}

	public static void launchUrl(String url) {
		driver.get(url);
	}
	
	public static void fillTextBox(WebElement element, String value) {
		element.sendKeys(value);
	
	}
	
	public static void btnClick(WebElement e) {
		e.click();
	}
	
	public static void browserQuit() {
		driver.quit();
	}
	
	public static String getcurrentUrl() {
		return driver.getCurrentUrl();	
	}
	
	public static void main(String[] args) {
		browserLaunch("Chrome");
		launchUrl("https://adactinhotelapp.com/Register.php");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Vijay4425");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Aarav@25");
		WebElement confirm = driver.findElement(By.id("re_password"));
		confirm.sendKeys("Aarav@25");
		WebElement fullname = driver.findElement(By.id("full_name"));
		fullname.sendKeys("Vijayakumar");
		WebElement mailid = driver.findElement(By.id("email_add"));
		mailid.sendKeys("visin.mech@gmail.com");
		WebElement btnchk = driver.findElement(By.id("tnc_box"));
		btnchk.click();
		
	
		
		
		
	}
	
	
}
	
	
	
	
	
	