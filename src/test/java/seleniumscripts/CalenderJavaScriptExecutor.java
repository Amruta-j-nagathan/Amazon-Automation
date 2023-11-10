package seleniumscripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderJavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.redbus.com/");
		
		//Thread.sleep(5000);
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("document.getElementById('onward_cal').value='12/12/2024'");
		
		


	}

	
}
