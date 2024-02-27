package Axis.Axis_Manipal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_cmd {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver",
		 "C:\\Users\\Sarvesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
				WebDriver driver=new ChromeDriver();
				driver.get("https://the-internet.herokuapp.com/checkboxes");
				driver.manage().window().maximize();
				WebElement checkb= driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
				Thread.sleep(500);
				if(checkb.isSelected()) {
					checkb.click();
				}
				//chnage female to male
				
				WebElement radiobmale= driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
				Thread.sleep(700);
				if(checkb.isEnabled())
				{
					radiobmale.click();				
					}
				
}
}



	