package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravisankar\\Desktop\\QA salinium\\Webdriver\\WebDriverProject\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.rediff.com/");
        
        //driver.findElement(By.xpath("//a[text()='Sign in']")).click();
           driver.findElement(By.linkText("Sign in")).click();
           driver.findElement(By.cssSelector("input[id='login1']")).sendKeys("hello");
           driver.findElement(By.xpath("//input[@type='password']")).sendKeys("hey");
           driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	

}
