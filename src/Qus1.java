import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Qus1 {
	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samsung\\Desktop\\eclipse\\pradeepa sekar\\Selenium5thDay\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		Thread.sleep(5000);
		TakesScreenshot tk=(TakesScreenshot)driver;
		Thread.sleep(5000);
		File src = tk.getScreenshotAs(OutputType.FILE);
		Thread.sleep(5000);
	    File des=new File("C:\\Users\\samsung\\Desktop\\eclipse\\pradeepa sekar\\Selenium7thDay\\Screen \\ pradeepa1.png");
	    Thread.sleep(5000);
	    FileUtils.copyFile(src, des);
		
		
	}
	

}
