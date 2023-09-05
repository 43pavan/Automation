package Pak1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PAVAN {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("http://127.0.0.1/login.do");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("Tasks")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		Thread.sleep(1000);
		WebElement customer=driver.findElement(By.xpath("//select[@class='controlBorder']"));
		Select sel=new Select(customer);
		sel.selectByVisibleText("Boston Chocolate");
		driver.findElement(By.xpath("//input[@value='  Show  ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Delete Selected']")).click();
	}
	//WebDriver driver= new ChromeDriver();
			//driver.get("https://paytm.com/");
			//Thread.sleep(2000);
			//Actions act=new Actions(driver);
			//Thread.sleep(2000);
			//WebElement PaytmBusiness=driver.findElement(By.xpath("//a[text()=('Paytm For Business')]"));
			//act.moveToElement(PaytmBusiness).perform();
}
