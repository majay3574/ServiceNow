package salesForce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ServiceNowMobile {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://dev140572.service-now.com\r\n");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.switchTo().frame(0);
	driver.findElement(By.id("user_name")).sendKeys("admin");
	driver.findElement(By.id("user_password")).sendKeys("P-qQ7@umSYz8");
	driver.findElement(By.id("sysverb_login")).click();
	driver.switchTo().defaultContent();
		//Service Catalog

	driver.findElement(By.id("filter")).sendKeys("Service Catalog",Keys.ENTER);
	driver.findElement(By.xpath("(//div[text()='Service Catalog'])[1]")).click();
	driver.switchTo().defaultContent();
	
	
	driver.switchTo().frame(0);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame(0);
	driver.findElement(By.id("detail_bd6fa75a4f334200086eeed18110c79e")).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//span[text()='iPhone 6s offers a multitude of features packaged within cutting edge design. ']")).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//button[@name='oi_order_now_button']")).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame(0);
	WebElement num = driver.findElement(By.xpath("//a[@id='requesturl']//b"));
	String uniqNum = num.getText();

	System.out.println(uniqNum);

	WebElement verify = driver.findElement(By.xpath("//span[text()='Thank you, your request has been submitted']"));
	String verify2 = verify.getText();
	System.out.println(verify2);

}
}
