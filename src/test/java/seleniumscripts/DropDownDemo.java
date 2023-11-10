package seleniumscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.ironspider.ca/forms/dropdowns.htm");
				
		WebElement e1 = driver.findElement(By.xpath("//select[@name='coffee']"));
		Select dd = new Select(e1);
		dd.selectByIndex(4);
		
		
		dd.selectByValue("regular");
		
		Thread.sleep(2000);
		
		dd.selectByValue("sugar");
		
		Thread.sleep(2000);
		
		dd.selectByVisibleText("With cream");
		
		//get all the options from the drop down and shows in the list
		List<WebElement> li = dd.getOptions();
		System.out.println("the size of the list : " + li.size());
		
		for(WebElement l: li) {
			System.out.println(l.getText());
		}
		

	}

}
