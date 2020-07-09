import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class YouTubeVideoTest {

	public static void main(String[] args) throws FindFailed {
		// TODO Auto-generated method stub

		
		/*System.setProperty("webdriver.gecko.driver", "/Users/cmallikarjunap/Downloads/Selenium-Java/geckodriver");
		WebDriver driver = new FirefoxDriver();	
		
		*/
		
		System.setProperty("webdriver.chrome.driver", "/Users/cmallikarjunap/eclipse-workspace/chromedriver");
		WebDriver driver = new ChromeDriver();	
		
		driver.manage().window().maximize();//maximize the window
		driver.manage().deleteAllCookies();//delete all cookies
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://www.youtube.com/watch?v=qvE2miLMbNk");//enter URL
		
		//Create the object of Screen class-sikuli
		
		Screen scr= new Screen();		
		
		//To Pause the video
		Pattern pauseImg= new Pattern("/Users/cmallikarjunap/eclipse-workspace/SikuliConceptTest/YT_Video_Pause.png");
		scr.wait(pauseImg, 2000);
		scr.click();
		scr.click();
		
		
		//TO Play the video:
		Pattern playImg= new Pattern("/Users/cmallikarjunap/eclipse-workspace/SikuliConceptTest/YT_Video_Play.png");
		scr.wait(playImg, 2000);
		scr.click();
		scr.click();
		
		
		//select settings
		Pattern settingImg= new Pattern("/Users/cmallikarjunap/eclipse-workspace/SikuliConceptTest/YT_Video_Settings.png");
		scr.wait(settingImg, 2000);
		scr.click();
		scr.click();
		
		
	
		
	}

}
