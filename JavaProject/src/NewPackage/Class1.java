package NewPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Class1 {

	public static void main(String[] args) {
		
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravisankar\\Desktop\\QA salinium\\chromedriver_win32\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");*/
		
		//System.setProperty("webdriver.gecho.driver", "C:\\Users\\Ravisankar\\Desktop\\QA salinium\\Webdriver\\WebDriverProject\\gechoDriver.exe");
		//WebDriver driver=new FirefoxDriver();
		//driver.get("https://www.google.com/");
		
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Ravisankar\\Desktop\\QA salinium\\MicrosoftWebDriver.exe");
	WebDriver driver=new InternetExplorerDriver();
	driver.get("https://www.google.com/");
	System.out.println(driver.getTitle());
	}
}
