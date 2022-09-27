package week4day1assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateSecurity {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.chittorgarh.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[contains(text(),'STOCK MARKET')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'NSE Bulk Deals')]")).click();
		//Thread.sleep(3000);
		List<WebElement> Securitynames = driver.findElements(By.xpath("//table[contains(@class,'table table-bordered')]//tr"));
		List<String> list=new ArrayList<String>();
		for (int i = 1; i < Securitynames.size(); i++) {
			String text= driver.findElement(By.xpath("//table[contains(@class,'table table-bordered')]//tr["+i+"]/td[3]")).getText();
			list.add(text);
			
		}
		//Thread.sleep(3000);
		System.out.println(list);
			System.out.println(list.size());
			Set<String> set=new LinkedHashSet<String>(list);
			System.out.println(set);
			System.out.println(set.size());
			
			if(list.size()==set.size())
			{
				System.out.println("Duplictes present");
			}
			else
			{
				System.out.println("Duplicates removed");
			}
		
	}

}
