package Week5.day2.servicenow.assignments;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class Ordering_Mobile {

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
		Thread.sleep(1000);
		shadow.findElementByXPath("//span[text()='Service Catalog']").click();
		Thread.sleep(2000);
		WebElement frame = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
		driver.findElement(By.xpath("(//img[@alt='Request for Apple iPhone 13 pro'])[2]")).click();
		driver.findElement(By.xpath("(//label[@class='radio-label'])[2]")).click();
		driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']")).click();
		driver.findElement(By.xpath("//option[@value='500MB']")).click();
		driver.findElement(By.xpath("(//label[@class='radio-label'])[5]")).click();
		driver.findElement(By.xpath("//label[@for='IO:86c4fa729792cd1021983d1e6253afd3_8335fe729792cd1021983d1e6253af37']")).click();
		driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
		String order_status = driver.findElement(By.xpath("//div[@class='notification notification-success']")).getText();
		System.out.println("Order Status:"+order_status);
		String ref_no = driver.findElement(By.xpath("//a[@id='requesturl']")).getText();
		System.out.println("Reference number:"+ref_no);
	}
}
