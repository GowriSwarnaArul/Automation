package seleniumClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/frame");
		WebElement firstframe = driver.findElementById("firstFr");
		driver.switchTo().frame(firstframe);
		driver.findElementByName("fname").sendKeys("Gowri");
		driver.findElementByName("lname").sendKeys("M");
		WebElement second =  driver.findElementByXPath("//iframe[@src=\"innerFrame\"]");
		driver.switchTo().frame(second);
		System.out.println("inside new frame");
		driver.findElementByName("email").sendKeys("email");
		driver.switchTo().defaultContent();
		driver.findElementByXPath("//a[text()='Watch tutorial']").click();
		driver.navigate().back();
		Thread.sleep(5000);
		driver.quit();
		

	}

}
