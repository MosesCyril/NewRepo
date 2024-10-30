package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorTest {
	WebDriver driver;
  @Test
  public void f() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	 driver.get("https://testautomationpractice.blogspot.com/");
	 
	 List<WebElement> items = driver.findElements(By.cssSelector("input[placeholder^='Enter']"));
	 
	 System.out.println("Number of items = "+ items.size());
	 
	 
	//WebElement username = driver.findElement(By.id("username"));
	 //WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
	// username.sendKeys("tomsmith");
	// WebElement password = driver.findElement(By.id("password"));
	// password.sendKeys("SuperSecretPassword!");
	 //driver.findElement(By.className("rADIUS")).click();
	 //driver.findElement(By.className("fa fa-2x fa-sign-in")).click();
	 //driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
	 
	// driver.findElement(By.linkText("elemental Selenium ")).click();
	 
// absolute xpath for username =	 /html/body/div[2]/div/div/form/div[1]/div/input
	 
	 // relative = //input[@id='username']
	 
	 
	 
	// driver.get("http://accounts.lambdatest.com/register"); 
	 
  }
}
