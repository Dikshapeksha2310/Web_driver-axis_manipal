package Axis.Axis_Manipal;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handling {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		 System.setProperty("webdriver.chrome.driver",
		 "C:\\Users\\Sarvesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
		 WebDriver driver=new ChromeDriver();
				driver.get("https://demoqa.com/browser-windows");
				driver.manage().window().maximize();
				// get the parent window handle

				String parentwindow = driver.getWindowHandle();
				System.out.println(parentwindow);
				Thread.sleep(500);
				//we use scroll bcoz sometime the element is not shown proper in page so we do scroll
				JavascriptExecutor js = (JavascriptExecutor)driver;
// vertical down scroll (x and y coordinates)
				js.executeScript("window.scrollBy(0 , 400)", "");
				WebElement tab=driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[1]"));
			//	WebElement tab = driver.findElement(By.cssSelector("#tabButton"));
				tab.click();
				Thread.sleep(500);
				Set<String> allWindows = driver.getWindowHandles();
				System.out.println(allWindows);
				Iterator<String>itr=allWindows.iterator();
				
				
				while(itr.hasNext()) {
					String childwindow=itr.next();
					if(!parentwindow.equalsIgnoreCase(childwindow)) {
						Thread.sleep(500);
						driver.switchTo().window(childwindow);
						Thread.sleep(500);
						//below code is just write for printing
						//WebElement text = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
						//String txt=text.getText();
						//System.out.println(txt);

					}
					Thread.sleep(500);
					
					
				}
				driver.switchTo().window(parentwindow);
				
				//driver.quit();
}
}
