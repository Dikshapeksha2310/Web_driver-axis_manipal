package practise_project;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Radio_Check_Dropdown {
	
	public static void main(String[] args) throws InterruptedException, IOException {

		 System.setProperty("webdriver.chrome.driver",
		 "C:\\Users\\Sarvesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
				WebDriver driver=new ChromeDriver();
				driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
				System.out.println("Redirect to page");
				driver.manage().window().maximize();
				 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				//For dropdown
				 Thread.sleep(1000);
					WebElement dropdown=driver.findElement(By.xpath("//*[@id='dropdowm-menu-1']"));
					
					Select drop =new Select(dropdown);
					drop.selectByValue("python");
					System.out.println(" Python selected in 1st Dropdown");
				Select drop2=new Select	(driver.findElement(By.xpath("//*[@id='dropdowm-menu-2']")));
					 	drop2.selectByVisibleText("Maven");
					 	System.out.println("Maven  selected in 2nd dropdown");
					
					 Select drop3=new Select(driver.findElement(By.xpath("//*[@id='dropdowm-menu-3']")));
							 drop3.selectByVisibleText("CSS");
							 System.out.println("CSS  selected in 2nd dropdown");
							
							 //checkbox
							 
		WebElement chkbox=	driver.findElement(By.xpath("//*[@id='checkboxes']/label[3]/input"));
		
		if(chkbox.isSelected()) {
			chkbox.click();
			System.out.println("Diselect the selected checkbox");
		}
		
		WebElement chkbox1=	driver.findElement(By.xpath("//*[@id='checkboxes']/label[1]/input"));
		if(chkbox1.isEnabled()) {
			chkbox1.click();
			System.out.println("select the selected checkbox");
		}
		
			//---Multipl Radio Button---//
		
		List<WebElement>radioli=driver.findElements(By.xpath("//input[@name='color']"));
		Thread.sleep(300);
		for(WebElement wb:radioli) {
			
			wb.click();
			System.out.println(" radio button select one  ");
			}
				 
	}
}
