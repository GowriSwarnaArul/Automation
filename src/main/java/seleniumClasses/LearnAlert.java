package seleniumClasses;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/alert");
		WebElement simpleShot = driver.findElementByXPath("//button[text()=\"Simple Alert\"]");
		simpleShot.click();
		Alert simpleText = driver.switchTo().alert();
		System.out.println(simpleText.getText());
		driver.switchTo().alert().accept();
		
		File StartShot = simpleShot.getScreenshotAs(OutputType.FILE);
		File destination = new File("./snaps/img11.png");
		FileHandler.copy(StartShot, destination);
		
		WebElement confirmAlert = driver.findElementById("confirm");
		confirmAlert.click();
		Alert confirmText = driver.switchTo().alert();
		System.out.println(confirmText.getText());
		driver.switchTo().alert().dismiss();
		
		File confirmAlert1 = confirmAlert.getScreenshotAs(OutputType.FILE);
		File destination1 = new File("./snaps/img12.png");
		FileHandler.copy(confirmAlert1, destination1);
		
		driver.findElementById("prompt").click();
		Alert promptText = driver.switchTo().alert();
		promptText.sendKeys("Gowri");
		driver.switchTo().alert().accept();
		String promptName = driver.findElementById("myName").getText();
		System.out.println(promptName);
		
		driver.findElementById("modern").click();
		WebElement sweetText= driver.findElementByXPath("//p[text()=\"Modern Alert - Some people address me as sweet alert as well \"]");
		System.out.println(sweetText.getText());
		driver.findElementByXPath("//button[@class=\"modal-close is-large\"]").click();
		
		Thread.sleep(5000);
		System.out.println("Closed the browser");
		driver.quit();
	}

	//unhandledAlertException
	//NoAlertPresentException
}
