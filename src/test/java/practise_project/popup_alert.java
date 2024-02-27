package practise_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup_alert {
    public static void main(String[] args) throws InterruptedException {
	       
    	 System.setProperty("webdriver.chrome.driver",
    			 "C:\\Users\\Sarvesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    				
	      
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        
	        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS); // Adjust time as needed
	      
	        driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
	        System.out.println("Navigate to  url page ");
	       
	       WebElement ClickMe1 = driver.findElement(By.xpath("//*[@id=\"button1\"]"));
	        
	       ClickMe1.click();
	       System.out.println("ClickMe1 succesfull");
	      
	       org.openqa.selenium.Alert alert = driver.switchTo().alert();
	        alert.accept();
	        System.out.println("Alert handle succesfull");
	       
	        WebElement ClickMe2 = driver.findElement(By.xpath("//*[@id=\"button2\"]"));
	       Thread.sleep(500);
	      
	         ClickMe2.click();
	        System.out.println("ClickMe2 succesfull");
	       
	        WebElement Close = driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button")); 
	        Close.click();
	        System.out.println("close alert succesfull");
	   
	        WebElement ClickMe3 = driver.findElement(By.xpath("//*[@id=\"button3\"]"));
	        
	        ClickMe3.click();
	        System.out.println("ClickMe3 succesfull");
	        
			WebElement clickme=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/span[1]/p[1]"));
			clickme.click();
	      
			System.out.println("clickme succesfull");
			
			WebElement ajaxclose=driver.findElement(By.xpath("//*[@id=\"myModalClick\"]/div/div/div[3]/button"));
			
			ajaxclose.click();
			System.out.println("ajaxclose succesfull" );
	    
			driver.navigate().back();
			System.out.println("Back to Page" );
	  
	        WebElement ClickMe4 = driver.findElement(By.xpath("//*[@id=\"button4\"]"));
	        
	        ClickMe4.click();
	        
	    	System.out.println("ClickMe4 succesfull" );
	        org.openqa.selenium.Alert alert2 = driver.switchTo().alert();
	        alert2.accept();
	        System.out.println("alert succesfull" );
	        WebElement ClickMe4a = driver.findElement(By.xpath("//*[@id=\"button4\"]"));
	        
	        ClickMe4a.click();
	        System.out.println("click succesfull" );
	        
	        org.openqa.selenium.Alert alert3 = driver.switchTo().alert();
	        alert3.dismiss();
	        System.out.println("Alert declined");
	  
	        
}

}
