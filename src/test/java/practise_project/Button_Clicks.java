package practise_project;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button_Clicks {
	public static void main(String[] args) throws InterruptedException, IOException {
		 System.setProperty("webdriver.chrome.driver",
		 "C:\\Users\\Sarvesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
				WebDriver driver=new ChromeDriver();
				driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");
		        driver.manage().window().maximize();
		        Thread.sleep(800);
		       WebElement ClickButton1 = driver.findElement(By.xpath("//*[@id=\"button1\"]"));
		        ClickButton1.click();
		        Thread.sleep(800);
		        WebElement Close1 = driver.findElement(By.xpath("//*[@id=\"myModalClick\"]/div/div/div[3]/button")); 
		        Close1.click();
		        System.out.println("Clicked 1 & Closed the PopUp");

		        WebElement ClickButton2 = driver.findElement(By.xpath("//*[@id=\"button2\"]"));
		        
		        ClickButton2.click();
		        Thread.sleep(800);
		        WebElement Close2 = driver.findElement(By.xpath("//*[@id=\"myModalJSClick\"]/div/div/div[3]/button")); 
		        Close2.click();
		        System.out.println("Clicked 2 & Closed the PopUp");

		        Thread.sleep(800);
		        WebElement ClickButton3 = driver.findElement(By.xpath("//*[@id=\"button3\"]"));
		        
		        ClickButton3.click();
		        Thread.sleep(800);
		        WebElement Close3 = driver.findElement(By.xpath("//*[@id=\"myModalMoveClick\"]/div/div/div[3]/button")); 
		        Close3.click();
		        System.out.println("Clicked 3 & Closed the PopUp");

		        Thread.sleep(800);
		       
	}
}
