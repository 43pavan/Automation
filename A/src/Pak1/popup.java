package Pak1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class popup {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver= new ChromeDriver();
		driver.get("http://127.0.0.1/login.do");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//a[@class='content administration']//img[@class='sizer']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Logo & Color Scheme']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='uploadNewLogoOption']")).click();
		Thread.sleep(2000);
		WebElement choosefile=driver.findElement(By.xpath("(//input[@type='file'])[1]"));
		Actions act=new Actions(driver);
		if(choosefile.isEnabled());
		{
			act.click(choosefile).perform();
			Thread.sleep(2000);
		}
			Runtime.getRuntime().exec("./upload/upload.exe");
		
		
		
		
		
		
	}

}
