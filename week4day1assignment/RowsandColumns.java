package week4day1assignment;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RowsandColumns {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://html.com/tags/table");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement> row = driver.findElements(By.xpath("//div[@class='render']//tr[1]"));
		for (int i = 0; i < row.size(); i++) {
			System.out.println("Rows:"+row.size());
			break;
		}
		List<WebElement> columns = driver.findElements(By.xpath("//div[@class='render']//tr[1]/th"));
		for (int i = 0; i < row.size(); i++) {
			System.out.println("Columns:"+columns.size());
			break;
		}
		
	}

}
