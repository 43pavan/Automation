package Pak1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot1
{

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://127.0.0.1/login.do");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(1000);
		WebElement tasks=driver.findElement(By.xpath("//div[text()='Tasks']"));
		Actions act=new Actions(driver);
		act.contextClick(tasks).perform();
		Thread.sleep(2000);
		Robot rbt=new Robot();
		rbt.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rbt.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rbt.keyPress(KeyEvent.VK_ENTER);  
		
		
	}

}
	


	