package seleniumClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDragAndDropBy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://letcode.in/draggable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//driver.switchTo().frame(0);
		WebElement source1 = driver.findElementById("sample-box");
		Actions builder1 = new Actions(driver);
		int x = source1.getLocation().getX();
		int y = source1.getLocation().getY();
		System.out.println(x+ " "+y);
		builder1.dragAndDropBy(source1, 199, 98).perform();
		Thread.sleep(5000);
		driver.quit();
	}

}
