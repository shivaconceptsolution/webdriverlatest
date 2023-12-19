package com.scs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictwaitExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe"); 
	    WebDriver driver = new ChromeDriver();  
	    driver.get("https://google.com/ncr");
	    driver.findElement(By.name("q")).sendKeys("cheese" + Keys.ENTER);
	     // Initialize and wait till element(link) became clickable - timeout in 10 seconds
	    WebElement firstResult = new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));
	     // Print the first result
	    System.out.println(firstResult.getText());

	}

}
