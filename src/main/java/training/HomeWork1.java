package training;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeWork1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Select select = new Select(null);
		
		driver.get("https://www.naukri.com/");
		driver.findElementByXPath("//input[@placeholder=\"Enter skills / designations / companies\"]").click();
		driver.findElementByXPath("//input[@placeholder=\"Enter skills / designations / companies\"]").sendKeys("Test Engineer");
		driver.findElementById("expereinceDD").click();
		driver.findElementByXPath("(//ul[@class=\"dropdown \"])/li[@index=\"1\"]").click();
		driver.findElementByXPath("//input[@placeholder=\"Enter location\"]").click();
		String location = driver.findElementByXPath("//input[@placeholder=\"Enter location\"]").getAttribute("value");
		System.out.println(location);
		driver.findElementByXPath("//input[@placeholder=\"Enter location\"]").sendKeys("Bangalore");
		String location1 = driver.findElementByXPath("//input[@placeholder=\"Enter location\"]").getAttribute("value");
		System.out.println(location1);
		driver.findElementByXPath("//div[text()=\"Search\"]").click();
		driver.quit();
	}

}
