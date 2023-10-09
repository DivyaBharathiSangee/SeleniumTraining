package org.bas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public static WebDriver driver;
	
	public static void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
	}
	public static void windowMaximize()
	{
		driver.manage().window().maximize();
	}
	public static void launchUrl(String url)
	{
		driver.get(url);
	}
	public static String pageTitle()
	{
		String title=driver.getCurrentUrl();
		//System.out.println(title);
		return title;
	}
	public static String pageUrl()
	{
		String url=driver.getCurrentUrl();
		//System.out.println(url);
		return url;
	}
	public static void passtext(String txt,WebElement e)
	{
		e.sendKeys(txt);
	}
	public static void closeEntireBrowser()
	{
		driver.quit();
	}
	public static void clickbtn(WebElement e)
	{
		e.click();
	}
}
