package com.Maven_Pro;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Run_Class {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("mohanmahesh");
	driver.findElement(By.id("password")).sendKeys("ZB5UA6");
	driver.findElement(By.id("login")).click();
	WebElement a = driver.findElement(By.id("location"));
	a.click();
	Select a1=new Select(a);
	a1.selectByValue("Paris");
	WebElement b = driver.findElement(By.id("hotels"));
	b.click();
	Select b1=new Select(b);
	b1.selectByValue("Hotel Sunshine");
	WebElement c = driver.findElement(By.id("room_type"));
	c.click();
	Select c1=new Select(c);
	c1.selectByValue("Deluxe");
	WebElement d = driver.findElement(By.id("room_nos"));
	d.click();
	Select d1=new Select(d);
	d1.selectByValue("2");
	 driver.findElement(By.id("datepick_in")).sendKeys("28");
   driver.findElement(By.id("datepick_out")).sendKeys("29");
   WebElement e = driver.findElement(By.id("adult_room"));
   e.click();
   Select e1=new Select(e);
   e1.selectByValue("2");
   WebElement f = driver.findElement(By.id("child_room"));
   f.click();
   Select f1=new Select(f);
   e1.selectByValue("2");
   driver.findElement(By.id("Submit")).click();
   driver.findElement(By.id("radiobutton_0")).click();
   driver.findElement(By.id("continue")).click();
   driver.findElement(By.id("first_name")).sendKeys("mohan");
   driver.findElement(By.id("last_name")).sendKeys("raj");
   driver.findElement(By.id("address")).sendKeys("15/5,the amman kovil st,pandamangalam,namakkal");
   driver.findElement(By.id("cc_num")).sendKeys("4563893480384739");
   WebElement g = driver.findElement(By.id("cc_type"));
   g.click();
   Select g1=new Select(g);
   g1.selectByValue("VISA");
   WebElement h = driver.findElement(By.id("cc_exp_month"));
   h.click();
   Select h1=new Select(h);
   h1.selectByValue("2");
   WebElement i = driver.findElement(By.id("cc_exp_year"));
   i.click();
   Select i1=new Select(i);
   i1.selectByValue("2022");
   driver.findElement(By.id("cc_cvv")).sendKeys("454");
   driver.findElement(By.id("book_now")).click();
   Thread.sleep(10000);
   JavascriptExecutor js=(JavascriptExecutor) driver;
   js.executeScript("window.scrollBy(0,500)");
   TakesScreenshot ts=(TakesScreenshot) driver;
	File TF = ts.getScreenshotAs(OutputType.FILE);
	File Loc=new File("C:\\Users\\MOHAN\\eclipse-workspace\\Maven_Pro\\ScreenShot\\pic1.png");
	FileHandler.copy(TF, Loc);
}

}

