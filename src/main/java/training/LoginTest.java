package training;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElementByXPath("//input[@type=\"text\"]").sendKeys("One plus 10T");
		driver.findElementByXPath("//button[@title=\"Search for Products, Brands and More\"]").click();
	
	}

}
