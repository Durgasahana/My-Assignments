package week2.day2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Durga");
		driver.findElement(By.name("lastname")).sendKeys("Sahana");
		driver.findElement(By.name("reg_email__")).sendKeys("durga@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Abc123!");
		WebElement element1 = driver.findElement(By.id("day"));
		Select e1=new Select(element1 );
		e1.selectByIndex(3);
		WebElement element2 = driver.findElement(By.id("month"));
		Select e2=new Select(element2);
		e2.selectByValue("10");
		WebElement element3 = driver.findElement(By.id("year"));
		Select e3=new Select(element3);
		e3.selectByVisibleText("2018");
		driver.findElement(By.name("sex")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
