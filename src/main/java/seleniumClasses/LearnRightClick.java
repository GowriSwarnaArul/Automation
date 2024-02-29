package seleniumClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnRightClick {

	public static void main(String[] args) {
		
		String str1 = "Gowri";
		String sr = new String(); // heap memory 
		StringBuilder strr = new StringBuilder();
		StringBuffer strrr = new StringBuffer("buffer");
		
		StringBuffer stringBuffer = new StringBuffer("Hello");
		String str = stringBuffer.toString();
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println(str);
		
		driver.quit();

	}

}
