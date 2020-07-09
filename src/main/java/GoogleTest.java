import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class GoogleTest {

	public static void main(String[] args) throws FindFailed {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "/Users/cmallikarjunap/eclipse-workspace/chromedriver");
		WebDriver driver = new ChromeDriver();	
		
		driver.manage().window().maximize();//maximize the window
		driver.manage().deleteAllCookies();//delete all cookies
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");//enter URL
		
		Screen scr= new Screen();		
		
		Pattern gsearch= new Pattern("/Users/cmallikarjunap/eclipse-workspace/SikuliConceptTest/googlesearch.png");
		scr.wait(gsearch, 2000);
		scr.click();
		scr.click();
		
		
	}

}
