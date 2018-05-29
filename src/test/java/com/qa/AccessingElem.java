package com.qa;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Document;

public class AccessingElem {
	
	static WebDriver driver;
	//File file;
	
	@DataProvider(name="testData")
	public Object[][] putTestData() {
		Object data[][]= {{"rohanw","John@028"},{"admin1","pass1"},{"admin2","pass2"}};
		
		return data;
	}
	
	

@Test(dataProvider="testData")

public  void access(String uname,String pwd) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SIT\\AppData\\Roaming\\npm\\node_modules\\chromedriver\\lib\\chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();
		
		
		
		
		driver.get("http:www.freecrm.com");
		//driver.navigate().to("http:www.google.com");
		
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
		
		WebElement submitBtn=driver.findElement(By.xpath("//input[@type='submit']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",submitBtn);
		
		//takeScreenshot("homepage"+System.currentTimeMillis());
		
		Assert.assertEquals(driver.getTitle(), "CRMPRO");
		
		driver.quit();
		
	
}



	


	
}
