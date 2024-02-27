package Axis.Axis_Manipal;

 import org.openqa.selenium.WebDriver;
	
	import org.openqa.selenium.edge.EdgeDriver;

	public class ms_edge {
			
		//public static WebDriver driver;
		
			public static void main(String[] args) {

				System.setProperty("webdriver.edge.driver",
					"C:\\Users\\Sarvesh\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");

			
			
			WebDriver driver = new EdgeDriver();
			
			driver.get("https://www.makemytrip.com/");

		}
	}


