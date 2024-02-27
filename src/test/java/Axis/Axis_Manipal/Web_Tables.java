package Axis.Axis_Manipal;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Web_Tables {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		 System.setProperty("webdriver.chrome.driver",
		 "C:\\Users\\Sarvesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
				WebDriver driver=new ChromeDriver();
				driver.get("https://the-internet.herokuapp.com/tables");
				driver.manage().window().maximize();
				
				
				//table format  thead/ tbody/ tr/ td
				List<WebElement>rowno=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
				int rowcount=rowno.size();
				System.out.println("no of rows: "+rowcount);
				//use to get colum cnt 
				List<WebElement>colcount=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td"));
				
				int columncnt=colcount.size();
				System.out.println("column count of given row is :"+columncnt );
				
				
				//-------// explicit wait is used to wait for a particular element based on the expected condition
				// explicit wait - to wait for the compose button to be click-able or it is work only for one element
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id = 'table1']/tbody/tr[2]/td[3]")));
				//fetch the cell data from particular cell
				//here we fetch data of 2nd row 3rd col
			WebElement fetch = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[2]/td[3]"));
			//this is use to get data or text present in that cell
			String text=fetch.getText();;
			String ExpectedText="fbach@yahoo.com";
			
			if(text.equals(ExpectedText))
			{
				
				System.out.println("Correct Data fetch");
			}
			else
			{
				System.out.println("wrong input or no data found");
			}
	}
				

}
