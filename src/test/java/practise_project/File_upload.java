package practise_project;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class File_upload {
	public static void main(String[] args) throws InterruptedException, IOException {
		 System.setProperty("webdriver.chrome.driver",
		 "C:\\Users\\Sarvesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
				WebDriver driver=new ChromeDriver();
				 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

				driver.get("https://webdriveruniversity.com/File-Upload/index.html");
				System.out.println("Navigate to url page");
					driver.manage().window().maximize();
					
				driver.findElement(By.xpath("//input[@name='filename']")).sendKeys("C:\\Users\\Sarvesh\\OneDrive\\Pictures\\Screenshot 2024-02-07 125404.png");
				System.out.println("Upload file from destination with valid format");
				driver.findElement(By.xpath("//input[@id='submit-button']")).click();
				System.out.println("Click on Upload");
				//after submit button click ther is alert come 
				
				Alert alt = driver.switchTo().alert();
				alt.accept();
				System.out.println("Alert handled and file uploded");
				
	}
}
