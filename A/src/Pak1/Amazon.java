package Pak1;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException
	{
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.amazon.com/");
			driver.findElement(By.xpath("//a[@class='nav-a nav-a-2 nav-progressive-attribute']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("https://m.media-amazon.com/images/I/61S0XNTbYBL._AC_UL400_.jpg")).click();
	}

}
