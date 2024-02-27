package practise_project;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	public static void main(String[] args) throws InterruptedException, IOException {
		 System.setProperty("webdriver.chrome.driver",
		 "C:\\Users\\Sarvesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
				WebDriver driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				driver.get("https://webdriveruniversity.com/Datepicker/index.html");
				System.out.println("Navigate to url");
				driver.manage().window().maximize();
				
			driver.findElement(By.xpath("//*[@id='datepicker']/span")).click();
			System.out.println("Click on calender icon");
			driver.findElement(By.xpath("//td[contains(text(),'20')]")).click();
			System.out.println("Date is selected and displayed");
			
			
	}
}
