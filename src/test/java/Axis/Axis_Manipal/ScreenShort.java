package Axis.Axis_Manipal;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShort {
	public static void main(String[] args) throws InterruptedException, IOException {

		 System.setProperty("webdriver.chrome.driver",
		 "C:\\Users\\Sarvesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.makemytrip.com/");
				driver.manage().window().maximize();
				Thread.sleep(500);
				//Take ss as class and getscrenshort()as method
				
				File f= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			Files.copy(f, new File("C:\\Users\\Sarvesh\\OneDrive\\Pictures\\Screenshots\\MakeMyTrip.png"));

}
}
