package practise_project;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contact_us {
	
	public static void main(String[] args) throws InterruptedException, IOException {

		 System.setProperty("webdriver.chrome.driver",
		 "C:\\Users\\Sarvesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
				WebDriver driver=new ChromeDriver();
				driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
				System.out.println("anvigate to url");
				driver.manage().window().maximize();
				 driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
				
				WebElement firestn=  driver.findElement(By.xpath("//form[@id=\"contact_form\"]/input[1]"));
				firestn.click();
				firestn.sendKeys("Diksha");
				System.out.println("Entered firstname");
				WebElement lastn=  driver.findElement(By.xpath("//form[@id=\"contact_form\"]/input[2]"));
				lastn.click();
				lastn.sendKeys("Gaikwad");
				System.out.println("Entered Lastname");
			
				WebElement email=  driver.findElement(By.xpath("//form[@id=\"contact_form\"]/input[3]"));
				email.click();
				email.sendKeys("dikshag@123@gmail.com");
				System.out.println("Enterd valid Email");
				
				WebElement cmmt=  driver.findElement(By.xpath("//*[@id=\"contact_form\"]/textarea"));
				cmmt.click();
				cmmt.sendKeys("Add: pune");
				System.out.println("Entered comment");
				
				WebElement submit=  driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));
				submit.click();
				System.out.println("submit Sucessfull ");
				
				driver.navigate().back();
				System.out.println("navigate back");
				
				WebElement reset=  driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[1]"));
				reset.click();
				System.out.println("Reset all information");
				driver.quit();
				System.out.println("Quit the session");
					
}
}
