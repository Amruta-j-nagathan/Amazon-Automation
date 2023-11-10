package seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

	public static void main(String[] arg) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		//Open a website
		// ctrl shift + o to requird imports
		
				driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%25253ASign+up");
				
				//Maximize the browser window
				
				driver.manage().window().maximize();
				
				 
				//Insect the element username using id loactor and check if the texting is present or not
				
				boolean displayed = driver.findElement(By.id("wpName2")).isDisplayed();
				System.out.println("element is displayed ?" + displayed);
				
				boolean enabled = driver.findElement(By.id("wpName2")).isEnabled();
				System.out.println("element is displayed ?" + enabled);
				
				//driver.findElement(By.id("wpName2")).sendKeys("demosrc");
				driver.findElement(By.cssSelector("#wpName2")).sendKeys("moona");
				
				/*boolean displayed1 = driver.findElement(By.id("wpPassword2")).isDisplayed();
				System.out.println("element is displayed ?" + displayed1);
				
				boolean enabled1 = driver.findElement(By.id("wpPassword2")).isEnabled();
				System.out.println("element is displayed ?" + enabled1);
				
				driver.findElement(By.id("wpPassword2")).sendKeys("demosrc@123");*/
				
				WebElement password = driver.findElement(By.id("wpPassword2")); 
				
				displayed = password.isDisplayed();
				System.out.println("Element password is diplayed ?" + displayed);
				
				enabled = password.isEnabled();
				System.out.println("Element password is enabled ?" + enabled);
				
				password.sendKeys("admin@1234");
				
				
				
				WebElement retypePassword = driver.findElement(By.name("retype"));
				retypePassword.sendKeys("admin@1234");
				
				WebElement email = driver.findElement(By.name("email"));
				email.sendKeys("admin@1234gmail.com");
				
				driver.navigate().to("https://www.redbus.in/");
				
				//driver.findElement(By.tagName("(//input[1]")).sendKeys("mumbai");
				
				//driver.findElement(By.xpath("//*[@id=\'src\']")).sendKeys("mumbai");
				
				driver.findElement(By.cssSelector("#src")).sendKeys("pune");
				
				
				
				
				
				
				
		

	}

}
