package webdriverpack;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmezonShoping {

	//private static final int OutputType = 0;

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravisankar\\Desktop\\QA salinium\\Webdriver\\WebDriverProject\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("field-keywords")).sendKeys("iphone7s");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		driver.findElement(By.xpath("//h2[@data-attribute='Apple iPhone 7, GSM Unlocked, 32GB - Rose Gold (Refurbished)']")).click();
		    
		/*TakesScreenshot takescreenshot=(TakesScreenshot)driver;
		    File file=takescreenshot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("Screenshot/Amezon.png"));*/
		   
		    
		driver.findElement(By.id("add-to-cart-button")).click();
		Robot robot=new Robot();
		Rectangle rect=new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		BufferedImage image = robot.createScreenCapture(rect);
        ImageIO.write(image, "png", new File("Screenshot/Amezonrobo.png"));
		
		Thread.sleep(2000);
		driver.findElement(By.id("siNoCoverage-announce")).click();
		driver.findElement(By.id("hlb-view-cart-announce")).click();
		
	
		
		}
	

}
