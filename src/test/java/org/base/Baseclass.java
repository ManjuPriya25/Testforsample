package org.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	static WebDriver driver ;
public static WebDriver ChromeBrowser() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	return driver;
}
public static void UrlLaunch (String Url) {
	driver.get(Url);
	driver.manage().window().maximize();
}
public static void implicitlyWait(int a) {
	driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);
}
public static void sendkeys(WebElement e, String Value) {
	e.sendKeys(Value);
}
public static  void Click(WebElement e) {
	e.click();
}
public static void selectByValue(WebElement e , String a) {
	Select s=new Select(e);
	s.selectByValue(a);
}
public static String getAttribute(WebElement e) {
	String text = e.getAttribute("Value");
	return text;
	

}


}
