package Axis.Axis_Manipal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_cmd {
	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver",
		 "C:\\Users\\Sarvesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
				WebDriver driver=new ChromeDriver();
				driver.get("https://automationexercise.com/");
				driver.navigate().forward();
				Thread.sleep(200);
				
				driver.navigate().back();
				Thread.sleep(300);
				
				driver.navigate().refresh();

}
}
