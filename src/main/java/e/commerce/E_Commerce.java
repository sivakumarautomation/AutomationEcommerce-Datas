package e.commerce; //package//

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E_Commerce { //class//
	
	public static void main(String[] args) throws InterruptedException { //Main//
		
		WebDriver odriver = new ChromeDriver();
		
		odriver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fcomputers");
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		//XPATH//
		//1.RadioButton//
		By radiobutton = By.xpath("(//input[@type='radio'])[1]");
		WebElement radio = odriver.findElement(radiobutton);
		radio.click();
      
		//2.First Name//
		By firstname = By.name("FirstName");
		WebElement first = odriver.findElement(firstname);
		first.sendKeys("Siva");
		
		//3.Last Name//
		
		By lastname = By.id("LastName");
		WebElement last = odriver.findElement(lastname);
		last.sendKeys("Kumar");
		
		// DROPPING DOWN//SELECT CLASS//BYVALUE,VISIBLE TEXT,INDEX//
		// A.Date//
		By Date = By.xpath("//select[@name='DateOfBirthDay']");

		WebElement Droppingdown = odriver.findElement(Date);

		Select Dd = new Select(Droppingdown);

		Dd.selectByIndex(12);

		// Dropping Down//
		// B.Month//

		By Month = By.xpath("//select[@name='DateOfBirthMonth']");

		WebElement monthly = odriver.findElement(Month);

		Select Mm = new Select(monthly);

		Mm.selectByVisibleText("January");

		// Dropping Down//
		// C.Year//

		By Year = By.xpath("//select[@name='DateOfBirthYear']");

		WebElement Yearly = odriver.findElement(Year);

		Select Yr = new Select(Yearly);

		Yr.selectByValue("1989");

		// 4.E-mail//

		By email = By.xpath("(//input[@type='email'])[1]");

		WebElement username = odriver.findElement(email);

		username.sendKeys("sivakumarsocialmedianetworks@gmail.com");

		// 5.Company//

		By Company = By.xpath("(//input[@type='text'])[4]");

		WebElement organization = odriver.findElement(Company);

		organization.sendKeys("Nucot Bangalore");

		// 6.CheckBox Offer//

		By Checkbox = By.xpath("//input[@type='checkbox']"); // click is default// click--Unclick//

		WebElement Check = odriver.findElement(Checkbox);

		Check.click();

		// 7.Password//

		By Password = By.id("Password");

		WebElement pass = odriver.findElement(Password);

		pass.sendKeys("12345MECHan");

		// 8.Confirm Password//

		By ConfirmPassword = By.id("ConfirmPassword");

		WebElement confirm = odriver.findElement(ConfirmPassword);

		confirm.sendKeys("12345MECHan");

		// 9.Register//

		By button = By.xpath("(//button[@type='submit'])[2]");

		WebElement Bn = odriver.findElement(button);
		Bn.click();
		    
		    
		         
		 
	}

}
