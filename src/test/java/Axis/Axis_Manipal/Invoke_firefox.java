package Axis.Axis_Manipal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Invoke_firefox {

	public static void main(String[] args) {
			 System.setProperty("webdriver.Gecko.driver",
			"C:\\Users\\Sarvesh\\Downloads\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
				
					WebDriver driver=new FirefoxDriver();
					 driver.get("https://www.selenium.dev/");

				}
 }


