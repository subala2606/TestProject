package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FollowingSiblings {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravisankar\\Desktop\\QA salinium\\Webdriver\\WebDriverProject\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.qaclickacademy.com/");
        driver.manage().window().maximize();
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[@id=\"homepage\"]/div[5]/div[2]/div/div/div/span/div/div[6]/div/div/button")).click();
        
        driver.findElement(By.linkText("Interview Guide")).click();
        driver.findElement(By.xpath("//ul[@role='tablist']//following-sibling::li[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"tablist1-panel2\"]/ul/li/div/h3[1]/text()")).click();
        String text=driver.findElement(By.xpath("//*[@id=\"tablist1-panel2\"]/ul/li/div/div[1]/p/text()")).getText();
        System.out.println(text);
	}

}
