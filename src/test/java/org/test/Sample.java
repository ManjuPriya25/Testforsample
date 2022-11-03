package org.test;

import org.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sample extends Baseclass {
public static void main(String[] args) {
	WebDriver driver=ChromeBrowser();
UrlLaunch("http://adactinhotelapp.com/SearchHotel.php");
implicitlyWait(30);
WebElement Username = driver.findElement(By.id("username"));	
sendkeys(Username , "ManjuPerumal");
WebElement Password = driver.findElement(By.id("password"));
sendkeys(Password , "3G43CG");
WebElement login = driver.findElement(By.id("login"));
Click(login);
WebElement Location = driver.findElement(By.id("location"));
selectByValue(Location, "London");
WebElement Hotels = driver.findElement(By.id("hotels"));
selectByValue(Hotels, "Hotel Hervey");
WebElement Rooms = driver.findElement(By.id("room_type"));
selectByValue(Rooms,"Deluxe");
WebElement Roomno = driver.findElement(By.id("room_nos"));
selectByValue(Roomno,"2");
WebElement Search = driver.findElement(By.id("Submit"));
Click(Search);
WebElement radioselect = driver.findElement(By.id("radiobutton_0"));
Click(radioselect);
WebElement continuebtn = driver.findElement(By.id("continue"));
Click(continuebtn);
WebElement Firstname = driver.findElement(By.id("first_name"));
sendkeys(Firstname , "Sai");
WebElement Lastname = driver.findElement(By.id("last_name"));
sendkeys(Lastname, "Baba");
WebElement address = driver.findElement(By.id("address"));
sendkeys(address, "No 10 , SP Street , Chennai - 600070");
WebElement credit = driver.findElement(By.id("cc_num"));
sendkeys(credit, "9845456787655678");
WebElement Ctype = driver.findElement(By.id("cc_type"));
selectByValue(Ctype, "MAST");
WebElement expirymonth = driver.findElement(By.id("cc_exp_month"));
selectByValue(expirymonth, "12");
WebElement expiryyear = driver.findElement(By.id("cc_exp_year"));
selectByValue(expiryyear, "2022");
WebElement Cvv = driver.findElement(By.id("cc_cvv"));
sendkeys(Cvv, "252");
WebElement Booknow = driver.findElement(By.id("book_now"));
Click(Booknow);
WebElement order = driver.findElement(By.id("order_no"));
String attribute = order.getAttribute("Value");
System.out.println(attribute);


}
}
