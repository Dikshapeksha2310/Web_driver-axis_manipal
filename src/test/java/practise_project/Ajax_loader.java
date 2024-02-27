package practise_project;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ajax_loader {
	public static void main(String[] args) throws InterruptedException, IOException {
		 System.setProperty("webdriver.chrome.driver",
		 "C:\\Users\\Sarvesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
				WebDriver driver=new ChromeDriver();
				driver.get("https://webdriveruniversity.com/Ajax-Loader/index.html");
				  System.out.println("Navigate to  url page ");
				driver.manage().window().maximize();
				
				//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[2]/span[1]/p[1]")));
				  System.out.println("waitning ");
				
				 WebElement clickme=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/span[1]/p[1]"));
				clickme.click();
				  System.out.println("button click on clickme");
				
				Thread.sleep(500);
				WebElement ajaxclose=driver.findElement(By.xpath("//*[@id=\"myModalClick\"]/div/div/div[3]/button"));
				
				ajaxclose.click();
				  System.out.println("alert handled and close it ");
				
	}
	

}
