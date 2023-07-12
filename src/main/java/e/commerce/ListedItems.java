package e.commerce;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListedItems {
	
	public static void main(String[] args) {
		
WebDriver odriver = new ChromeDriver();
		
		odriver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fcomputers");
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		
		// DROPPING DOWN//SELECT CLASS//BYVALUE,VISIBLE TEXT,INDEX//
				// A.Date//
				By Date = By.xpath("//select[@name='DateOfBirthDay']");

				WebElement Droppingdown = odriver.findElement(Date);

				Select Dd = new Select(Droppingdown);

				Dd.selectByIndex(12);
				
				//List all Options//
				
				         List<WebElement> Listed = Dd.getOptions();
				         
				         for(WebElement Li:Listed) {
				        	 System.out.println(Li.getText());
				         }

	}
	
	

}
