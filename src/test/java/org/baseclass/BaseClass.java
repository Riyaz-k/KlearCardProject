package org.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static Select select;

	//launching browser 
	public static WebDriver launch(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		
		return driver;
	}
	
	//http url	
	public static void URL(String url) {
		driver.get(url);
	}
	
	//Scrolling down
	public static void scroll() throws InterruptedException {
	JavascriptExecutor javascript =(JavascriptExecutor) driver;
	javascript.executeScript("window.scrollBy(0,600)");
	Thread.sleep(1500);
	}
	
	
	//dynmaic waits
		public static void delay(int i) throws InterruptedException {
			Thread.sleep(i);
		}
	
	//dynmaic waits
	public static void waitTime(int i) {
		driver.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);
	}

	//sendkeys methods
	public static void fill(String str, WebElement element) {
		element.sendKeys(str);
	}
	
	//click methods
	public static void btnClick(WebElement element) {
		element.click();
	}
	
	//dropdown interms of value
	public static void dropDownValue(String str, WebElement element) {
		element.sendKeys(str, Keys.ENTER);

	}
	//dropdown interms of visibility of text UI
	public static void dropDownVisibletext(String str, WebElement element) {
		select = new Select(element);
		select.selectByVisibleText(str);
	}
	
	//dropdown interms of index
	public static void dropDownIndex(int i, WebElement element) {
		select = new Select(element);
		select.selectByIndex(i);
	}
}
