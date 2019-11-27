import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qus9 {
	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samsung\\Desktop\\eclipse\\pradeepa sekar\\Selenium5thDay\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement a = driver.findElement(By.xpath("//input[@name='q']"));
		a.sendKeys("iphone");
		WebElement s = driver.findElement(By.xpath("//button[@class='vh79eN']"));
		s.click();

}}
