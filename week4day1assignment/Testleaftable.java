package week4day1assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testleaftable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testleaf.herokuapp.com/pages/table.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement> row = driver.findElements(By.xpath("//section[@class='innerblock']//table/tbody[1]/tr"));
		//for (int i = 0; i < row.size(); i++) {
			System.out.println("No.of rows:"+row.size());
			
		//}
		
		List<WebElement> columns = driver.findElements(By.xpath("//section[@class='innerblock']//table/tbody[1]/tr[1]/th"));
		//for (int i = 0; i <columns.size(); i++) {
			System.out.println("No. of columns:"+columns.size());
		//}

		String text = driver.findElement(By.xpath("//section[@class='innerblock']//table/tbody[1]/tr[3]/td[1]")).getText();
		System.out.println(text);
		
		driver.findElement(By.xpath("//section[@class='innerblock']//table/tbody[1]/tr[4]/td[3]/input[1]")).click();
	}
}
