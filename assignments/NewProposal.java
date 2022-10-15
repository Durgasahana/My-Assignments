package Week5.day2.servicenow.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class NewProposal {

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
		shadow.findElementByXPath("//div[@aria-label='All']").click();
		Thread.sleep(2000);
		shadow.findElementByXPath("//input[contains(@class,'navigation-filter keyboard')]").sendKeys("My Proposals");
		shadow.findElementByXPath("//span[@class='item-icon']").click();
		Thread.sleep(2000);
		WebElement frame = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//button[text()='New']")).click();
		driver.findElement(By.xpath("//input[@aria-label='Template description']")).sendKeys("template");
		driver.findElement(By.xpath("//button[@id='sysverb_insert']")).click();
		String proposal_id = driver.findElement(By.xpath("//table[@id='std_change_proposal_table']//tr/td[@class='vt']")).getText();
		System.out.println("Proposal ID:"+proposal_id);
	}

}
