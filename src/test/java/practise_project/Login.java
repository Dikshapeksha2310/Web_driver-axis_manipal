package practise_project;

import java.awt.Desktop.Action;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login {
	public static void main(String[] args) throws InterruptedException, IOException {

		 System.setProperty("webdriver.chrome.driver",
		 "C:\\Users\\Sarvesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
				WebDriver driver=new ChromeDriver();
				driver.get("https://webdriveruniversity.com/Login-Portal/index.html");
				driver.manage().window().maximize();
				
				 driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
			        driver.get("https://webdriveruniversity.com/Login-Portal/index.html?");
			       WebElement Username = driver.findElement(By.xpath("//*[@id=\"text\"]"));
			        Username.sendKeys("webdriver");
			        System.out.println("username entered");
			       
			        WebElement Password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
			        Password.sendKeys("webdriver123");
			        System.out.println("password entered");

			        WebElement LoginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
			        LoginButton.click();
			        System.out.println("Clicked on login");

			        org.openqa.selenium.Alert alert = driver.switchTo().alert();
			        alert.accept();
			        System.out.println("Validation Succesful");
		}
}
