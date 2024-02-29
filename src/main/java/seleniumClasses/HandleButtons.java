package seleniumClasses;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/buttons");
		WebElement position = driver.findElementById("position");
		Point point = position.getLocation();
		int x = point.getX();
		int y = point.getY();
		System.out.println("x value " +x+ "y value "+y);
		
		WebElement color =driver.findElementById("color");
		String colour = color.getCssValue("background-color");
		System.out.println("Background colour ==>"+colour);
		
		WebElement measurement = driver.findElementById("property");
		Rectangle measure = measurement.getRect();
		int height = measure.getHeight();
		int width = measure.getWidth();
		System.out.println("height is "+height+"\n" +"width is "+width);
		
		Dimension dime = measure.getDimension();
		int h = dime.getHeight();
		int w = dime.getWidth();
		System.out.println("height is "+h+"\n" +"width is "+w);

		WebElement disabled = driver.findElementById("isDisabled");
		boolean displayed = disabled.isEnabled();
		System.out.println(displayed);
	
		driver.quit();
		
	}

}
