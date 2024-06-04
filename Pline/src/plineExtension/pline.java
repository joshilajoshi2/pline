package plineExtension;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pline {
	 @Test
	    public void testPlineExtension() {
	    	WebDriverManager.chromedriver().setup();
	    	
	        ChromeOptions options = new ChromeOptions();
	        options.setExperimentalOption("debuggerAddress", "localhost:9988");
	        
	        WebDriver driver = new ChromeDriver(options);
	        driver.get("https://google.com");
	        
	        Actions actions = new Actions(driver);
	        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	        
}
}
