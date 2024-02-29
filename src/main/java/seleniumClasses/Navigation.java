package seleniumClasses;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/buttons");
		String url = driver.getCurrentUrl();
		System.out.println("Button page url :"+url);
		
		Thread.sleep(5000);
		
		driver.findElementById("home").click();
		String homeUrl = driver.getCurrentUrl();
		System.out.println("Home page URL:" +homeUrl);
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		System.out.println("Back button url => "+driver.getCurrentUrl());
		driver.navigate().refresh();
		driver.navigate().to("https://letcode.in/signin");
				
		driver.quit();
		
	}

}
