package Week5.day2.servicenow.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class NewCaller {

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
		//Thread.sleep(1000);
		shadow.findElementByXPath("//input[contains(@class,'navigation-filter keyboard')]").sendKeys("callers");
		shadow.findElementByXPath("//mark[text()='Callers']").click();
		Thread.sleep(2000);
		WebElement frame = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//button[text()='New']")).click();
		driver.findElement(By.xpath("//input[@class='form-control ']")).sendKeys("Durga");
		driver.findElement(By.xpath("(//input[@class='form-control '])[2]")).sendKeys("Sahana");
		//driver.findElement(By.xpath("(//input[@class='form-control'])[3]")).sendKeys("CTS");
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("durga@testleaf.com");
		driver.findElement(By.xpath("//input[@class='form-control phone-number']")).sendKeys("1203456789");
		driver.findElement(By.xpath("(//input[@class='form-control phone-number'])[2]")).sendKeys("9012345678");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		//String firstname = driver.findElement(By.xpath("/table[@id='sys_user_table']//tr[@class='list_row list_odd']/td[4]")).getText();
		//System.out.println("First Name:"+firstname);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Durga",Keys.ENTER);
		
		String fname = driver.findElement(By.xpath("//table[@id='sys_user_table']//tbody//tr[1]/td[4]")).getText();
		if(fname.contains("Durga"))
		{
			System.out.println("Caller has been created successfully");
		}
		else
		{
			System.out.println("Caller has not been created");
		}
		
	}

}
