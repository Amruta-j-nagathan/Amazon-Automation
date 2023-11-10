package seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementCheckbox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.ironspider.ca/forms/checkradio.htm");
		driver.findElements(By.xpath("//input[@name='color']")).get(1).click();
		driver.findElements(By.xpath("//input[@name='color']")).get(3).click();
		driver.findElements(By.xpath("//input[@name='color']")).get(5).click();
        
		driver.findElements(By.xpath("//input[@name='browser']")).get(2).click();
		driver.findElements(By.xpath("//input[@name='browser']")).get(0).click();
	}

}
