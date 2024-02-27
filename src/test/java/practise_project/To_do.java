package practise_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class To_do {
	   public static void main(String[] args) throws InterruptedException {
	       
		   System.setProperty("webdriver.chrome.driver",
					 "C:\\Users\\Sarvesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				
		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		      driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		       driver.get("https://webdriveruniversity.com/To-Do-List/index.html");
		      System.out.println("Navigate to url");
		        Actions actions = new Actions(driver);
		       WebElement AddNewTodo = driver.findElement(By.xpath("//*[@id=\"container\"]/input"));
		        actions.moveToElement(AddNewTodo).perform();
		        AddNewTodo.sendKeys("Contact Us");
		        AddNewTodo.sendKeys(Keys.ENTER);
		        System.out.println("Contact Us added");
		        AddNewTodo.sendKeys("Login Function");
		        AddNewTodo.sendKeys(Keys.ENTER);
		        System.out.println("Login Function added");
		        AddNewTodo.sendKeys("AddSignUp");
		        AddNewTodo.sendKeys(Keys.ENTER);
		        System.out.println("AddSignUp added");
		        WebElement Delpracticemagic = driver.findElement(By.xpath("//*[@id=\"container\"]/ul/li[3]/span/i"));
		        actions.moveToElement(Delpracticemagic).perform();
		        Delpracticemagic.click();
		        System.out.println("Practice Magic Deleted");
		        WebElement Plusicon = driver.findElement(By.xpath("//i[@id='plus-icon']"));
		        actions.moveToElement(Plusicon).perform();
		        Plusicon.click();	
		        System.out.println("Clicked on Plus icon and hide add to do element");    
	   }
}
