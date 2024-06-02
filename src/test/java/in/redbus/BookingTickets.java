package in.redbus;

import java.time.Duration;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookingTickets {
	public static WebDriver driver;
	@BeforeClass
	public static void method1(){
		WebDriverManager.edgedriver().setup();
		EdgeOptions options = new EdgeOptions();
		options.addArguments("disable-notifications");
		options.addArguments("disable-popups");
		options.addArguments("start-maximized");
		driver = new EdgeDriver(options);
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	@Test
	public void method2() {
	driver.findElement(By.xpath("//input[@id='src']")).sendKeys("chennai");
	driver.findElement(By.xpath("//text[text()='Chennai']")).click();
	}
	@Test
	public void method3() {
	driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("trichy");
	driver.findElement(By.xpath("//text[text()='Trichy']")).click();
		}
	@Test
	public void method4() {
	driver.findElement(By.xpath("//span[text()='2' and contains(@class,'fgdqFw')]")).click();
		}
	@Ignore
	@Test
	public void method5() {
		driver.quit();
	}
	@Test
	public void method6() {
	driver.findElement(By.xpath("//button[@id='search_button']")).click();
	}
	@Test
	public void method7() {
		String a = "MBT TRAVELS";
   WebElement b = driver.findElement(By.xpath("//div[text()='MBT TRAVELS']"));
   String c = b.getText();
   System.out.println(c);
   Assert.assertEquals(a, c);
   System.out.println("equals");
   System.out.println(driver.findElement(By.xpath("//div[text()='23:35']")).getText());
   System.out.println(driver.findElement(By.xpath("//div[text()='05:35']")).getText());
   System.out.println(driver.findElement(By.xpath("//span[text()='650']")).getText());
	}
	@AfterClass
	public static void method8() {
		driver.close();
	}
}
