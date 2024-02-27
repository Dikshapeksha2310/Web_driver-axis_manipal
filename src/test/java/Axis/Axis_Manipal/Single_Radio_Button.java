package Axis.Axis_Manipal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Single_Radio_Button {
	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver",
		 "C:\\Users\\Sarvesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
				WebDriver driver=new ChromeDriver();
				driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
				driver.manage().window().maximize();
				WebElement radiob= driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
				Thread.sleep(500);
				if(radiob.isDisplayed()) {
					radiob.click();
				}
				//chnage female to male
				
				WebElement radiobmale= driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
				Thread.sleep(700);
				if(radiob.isSelected())
				{
					radiobmale.click();				
					}
				
}


}
