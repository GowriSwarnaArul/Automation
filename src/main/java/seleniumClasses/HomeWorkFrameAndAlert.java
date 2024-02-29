package seleniumClasses;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkFrameAndAlert {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		WebElement second = driver.findElementByName("iframeResult");
		driver.switchTo().frame(second);
		driver.findElementByXPath("//button[text()='Try it']").click();
		System.out.println("Clicked on Try it.");
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Gowri.M");
		driver.switchTo().alert().accept();
		
		WebElement demoName = driver.findElementByXPath("//p[@id='demo']");
		System.out.println(demoName.getText());
		driver.quit();
		
	}

}
