package salesForce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ServiceNowProposal {
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://dev140572.service-now.com");
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("P-qQ7@umSYz8");
		driver.findElement(By.id("sysverb_login")).click();
		
		driver.findElement(By.id("filter")).sendKeys("proposal");
		driver.findElement(By.xpath("//div[text()='My Proposals']")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[text()='New']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		
		WebElement tt=driver.findElement(By.id("std_change_proposal.short_description"));
		tt.sendKeys("its me");
		driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();
		
		WebElement success=driver.findElement(By.linkText("STDCHG0001011"));
		if(success.equals(success)) 
		{System.out.println("Successfully Created");}
		else {System.out.println("not created");}
	}

}