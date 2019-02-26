package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravisankar\\Desktop\\QA salinium\\Webdriver\\WebDriverProject\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://facebook.com/");
        driver.manage().window().maximize();
        
        //By xpath
        //tagname[@atribute='value']
        
       // driver.findElement(By.xpath("//input[@id='email']")).sendKeys("MyownXpath");
      //  driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("ownxpath");
      //  driver.findElement(By.xpath("//*[@value='Log In']")).click();
      
        //xpath with contains---//tagname[comtains(@atribute,'value')]
        
        driver.findElement(By.xpath("//input[contains(@data-testid,'royal_email')]")).sendKeys("MyownXpath");
        //xpath with text----//tagname[text='text']
        driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("ownxpath");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        
        
        
        //by css
        //tagname[atribute=value]
        //tagname#id---tagname.classname----
       // driver.findElement(By.cssSelector("input#email")).sendKeys("MyownXpath");
       //  driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("ownxpath");
       //  driver.findElement(By.cssSelector("input[type='submit']")).click();
	}

}
