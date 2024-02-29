package seleniumClasses;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	
		public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/buttons");
		File first = driver.getScreenshotAs(OutputType.FILE);
		File last = new File("./snaps/img6.png");
		FileHandler.copy(first, last);
	
		WebElement color = driver.findElementById("color");
		File firstcolor = color .getScreenshotAs(OutputType.FILE);
		File finalcolor = new File("./snaps/img7.png");
		FileHandler.copy(firstcolor,finalcolor);
		
		System.out.println("Done");
		
		driver.quit();
		
	}

}
