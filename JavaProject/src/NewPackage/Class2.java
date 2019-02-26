package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravisankar\\Desktop\\QA salinium\\Webdriver\\WebDriverProject\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://login.salesforce.com/");
        driver.manage().window().maximize();
        //with id
       /* driver.findElement(By.id("username")).sendKeys("subala");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.id("Login")).click();*/
        //with name or classname
       // driver.findElement(By.name("username")).sendKeys("subala");
       // driver.findElement(By.name("pw")).sendKeys("password");
       // driver.findElement(By.name("Login")).click();
        
        //with Xpath
       driver.findElement(By.xpath("//input[@type='email']")).sendKeys("subala");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
         driver.findElement(By.xpath("//input[@value='Log In']")).click();
         
        String errormsg= driver.findElement(By.id("error")).getText();
        System.out.println(errormsg);
        
        //with css
//        driver.findElement(By.cssSelector("#username")).sendKeys("subala");
//        driver.findElement(By.cssSelector("#password")).sendKeys("password");
//        driver.findElement(By.cssSelector("#Login")).click();
        

	}

}
