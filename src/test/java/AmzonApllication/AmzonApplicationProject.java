package AmzonApllication;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmzonApplicationProject {

	public static void main(String[] args) throws InterruptedException {
		// Open a Chrome Browser
		// Webdriver is a interface in selenium

		// Create a WebDriver instance for Chrome
		WebDriver driver = new ChromeDriver();

		// Open a website
		driver.get("https://www.amazon.in/");

		// Maximize the browser window
		driver.manage().window().maximize();

		// Get the current URL
		String currentURL = driver.getCurrentUrl();
		System.out.println("Current URL: " + currentURL);

		// Get the page title
		String pageTitle = driver.getTitle();
		System.out.println("Page Title: " + pageTitle);
		Thread.sleep(5000);

		// Find and interact with elements on the webpage

		// Perform some other actions, e.g., navigating back and forward
		driver.navigate().back();
		driver.navigate().forward();

		Thread.sleep(3000);

		// Refresh the current page
		driver.navigate().refresh();
		
		//Sign-In the amazon website

		Thread.sleep(7000);

		driver.get(
				"https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class='a-box-inner a-padding-extra-large']/descendant::input[1]"))
				.sendKeys("9845623451");

		driver.findElement(By.xpath("//div[@class='a-box-inner a-padding-extra-large']/descendant::input[3]"))
				.sendKeys("Amzonapp@123");

		driver.findElement(By.xpath("//div[@class='a-box-inner a-padding-extra-large']/descendant::input[5]")).click();

		Thread.sleep(7000);

		WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBox.sendKeys("iPhone 13");
		Thread.sleep(7000);

		WebElement searchBox1 = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchBox1.click();

		Thread.sleep(5000);
		// Verify the page's ability to scroll
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Scroll down by 5000 pixels
		js.executeScript("window.scrollBy(0,5000)", "");

		Thread.sleep(5000);

		// Scroll up by 5000 pixels
		js.executeScript("window.scrollBy(0,-5000)", "");

		/*driver.findElement(By.linkText("Get It Today")).click();
		// Thread.sleep(5000);
		
		//Filter

		driver.findElement(By.xpath("//i[@class='a-icon a-icon-star-medium a-star-medium-4']")).click(); 
		Thread.sleep(5000);*/
		
		//Add product to Wishlists

		driver.findElement(By.linkText("Apple iPhone 13 (128GB) - Midnight")).click();

		js.executeScript("window.scrollBy(0,2000)", ""); 

		driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-submit\"]")).click();

		/*WebElement confirmBox = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span/span"));

		// Click on the element to open the confirmation box
		confirmBox.click();

		// Check if the confirmation box is visible
		if (driver.findElement(By.xpath("//*[@class='\nav-icon nav-arrow\']")).isDisplayed()) {
			// The confirmation box is visible, do something with it
			System.out.println("Confirmation box is visible");
		} else {
			// The confirmation box is not visible, do something else
			System.out.println("Confirmation box is not visible");
		} */

		// Close the browser window
		//driver.close();

		// Quit the WebDriver instance and close all associated windows and processes
		driver.quit();
	}

}
