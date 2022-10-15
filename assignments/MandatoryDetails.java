package Week5.day2.servicenow.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class MandatoryDetails {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev10439.service-now.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Durga_test@4");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
		Thread.sleep(2000);
		Shadow shadow=new Shadow(driver);
		shadow.setImplicitWait(30);
		shadow.findElementByXPath("//div[@class='sn-polaris-tab can-animate polaris-enabled']").click();
		Thread.sleep(1000);
		shadow.findElementByXPath("//input[contains(@class,'navigation-filter keyboard')]").sendKeys("knowledge");
		shadow.findElementByXPath("//mark[text()='Knowledge']").click();
		//Thread.sleep(2000);
		WebElement frame = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//span[@class='btn-icon icon-article-document homepage-icon']")).click();
		driver.findElement(By.xpath("//input[@id='sys_display.kb_knowledge.kb_knowledge_base']")).sendKeys("IT");
		driver.findElement(By.xpath("//input[@id='sys_display.kb_knowledge.kb_category']")).sendKeys("IT-Java");
		driver.findElement(By.xpath("//input[@aria-label='Short description']")).sendKeys("Java");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}

}
