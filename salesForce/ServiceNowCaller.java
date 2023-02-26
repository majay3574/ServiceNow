package salesForce;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ServiceNowCaller {
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://dev140572.service-now.com\r\n");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame(0);
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("P-qQ7@umSYz8");
		driver.findElement(By.id("sysverb_login")).click();
		driver.switchTo().defaultContent();
		
//		driver.switchTo().frame(0);
		driver.findElement(By.id("filter")).sendKeys("All",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Callers']")).click();
		driver.switchTo().defaultContent();

		
		driver.switchTo().frame(0);

		driver.findElement(By.xpath("//button[text()='New']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.id("sys_user.first_name")).sendKeys("Ajay");
		driver.findElement(By.id("sys_user.last_name")).sendKeys("Michael");
		driver.findElement(By.id("sys_user.email")).sendKeys("majay3574@gmail.com");
		driver.findElement(By.id("sys_user.phone")).sendKeys("iPhone");
		driver.findElement(By.id("sys_user.mobile_phone")).sendKeys("Vivo");
		driver.findElement(By.id("lookup.sys_user.title")).click();
		
		Set<String> windowHandle = driver.getWindowHandles();
		List<String> windowHandle1=new ArrayList<String>(windowHandle);
		driver.switchTo().window(windowHandle1.get(1));
		
		driver.findElement(By.linkText("Vice President")).click();
		
		Set<String> windowHandle2 = driver.getWindowHandles();
		List<String> windowHandle3=new ArrayList<String>(windowHandle2);
		driver.switchTo().window(windowHandle3.get(0));
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("sysverb_insert_bottom")).click();
		
		WebElement successfull=driver.findElement(By.xpath("//div[@class='outputmsg_text']"));
		System.out.println(successfull.getText());

	}

}
