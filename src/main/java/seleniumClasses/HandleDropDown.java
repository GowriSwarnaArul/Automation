package seleniumClasses;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement fruits = driver.findElementById("fruits");
		Select myfruits = new Select(fruits);
		myfruits.selectByVisibleText("Apple");
		myfruits.selectByVisibleText("Banana");
		System.out.println(myfruits.isMultiple());
		
		WebElement country = driver.findElementById("country");
		Select mycountry = new Select(country);
		mycountry.selectByValue("India");
		WebElement selectedCountry = mycountry.getFirstSelectedOption(); //interview ques getFirstSelectedOption()
		System.out.println(selectedCountry.getText());
		
		WebElement heros = driver.findElementById("superheros");
		Select myheros = new Select(heros);
		boolean ismul = myheros.isMultiple();
		System.out.println(ismul);
		myheros.selectByIndex(0);
		myheros.selectByValue("bt");
		List<WebElement> allheros = myheros.getAllSelectedOptions();
		
		myheros.deselectByIndex(0);
		
		//driver.quit();

	}

}
