package week4day1assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learntables {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://html.com/tags/table");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement> table = driver.findElements(By.xpath("//div[@class='render']//tr"));
		
		for (int i = 0; i < table.size();i++) {
			System.out.println(table.get(i).getText());
		}
		
	}

}
