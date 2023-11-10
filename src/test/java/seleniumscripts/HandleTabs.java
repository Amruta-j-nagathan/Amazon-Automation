package seleniumscripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTabs {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		Robot r = new Robot();
		
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		
		r.keyPress(KeyEvent.VK_T);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		r.keyRelease(KeyEvent.VK_T);
		
		
		
		
        r.keyPress(KeyEvent.VK_CONTROL);
		
		r.keyPress(KeyEvent.VK_T);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		r.keyRelease(KeyEvent.VK_T);
		
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		
		System.out.println(tabs);
		
		driver.switchTo().window(tabs.get(0));
		
		driver.get("https://tutorialsninja.com/demo");
		
		Thread.sleep(3000);
		
        driver.switchTo().window(tabs.get(1));
		
		driver.get("https://github.com/");
		
		Thread.sleep(1000);
		
		driver.quit();
		
       
		
		
		
		

	}

}
