package week2.day2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Durga");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		
		String text = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-')]/a")).getText();
		System.out.println("Lead ID:"+text);
		String old = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-')]/a")).getText();
		System.out.println(old);
		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-')]/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.className("inputBox")).clear();
		driver.findElement(By.className("inputBox")).sendKeys("Amazon");
		String update=driver.findElement(By.name("submitButton")).getText();
		System.out.println(update);
		if(old.contains(update))
		{
			System.out.println("Company name gets edited");
		}
		else
		{
			System.out.println("Company name is not edited");
		}
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
