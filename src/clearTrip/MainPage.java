package clearTrip;

import java.time.LocalDate;
import java.time.Month;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MainPage extends BaseLib {
	
    
	//WebDriver driver = BaseLib.driver;
	public void clearTrip()
	{
		this.driver = driver;
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@id='RoundTrip']")).click();
		driver.findElement(By.id("FromTag")).sendKeys("Delhi");
		driver.findElement(By.id("ToTag")).sendKeys("Bengaluru");
		driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
		
		LocalDate todayDate = LocalDate.now();
		System.out.println("Today's Date.........."+todayDate);
		Month expMonth = todayDate.plusMonths(3).getMonth();
		String exppMonth = expMonth.toString();
		System.out.println("Departure months.."+exppMonth);
		WebElement firstMonth = driver.findElement(By.xpath("//div[@class='monthBlock first']//span[@class='ui-datepicker-month']"));
		String FirstMonth = firstMonth.getText();
		System.out.println("First Months...."+FirstMonth);
		 
		 WebElement nextMonth = driver.findElement(By.xpath("//div[@class='monthBlock last']//span[@class='ui-datepicker-month']"));
		    String NextMonth = nextMonth.getText();
		 System.out.println("Next Months....."+NextMonth);
		   while(!(FirstMonth.equalsIgnoreCase(exppMonth)))
				   {
		   			if(!(NextMonth.equalsIgnoreCase(exppMonth)))
		   				{
		   				driver.findElement(By.xpath("//a[@class='nextMonth ']")).click();
		   				 NextMonth = driver.findElement(By.xpath("//div[@class='monthBlock last']//span[@class='ui-datepicker-month']")).getText();
		   		    
		   		        System.out.println("Next Months....."+NextMonth);
		   				System.out.println("Inside if..."+FirstMonth);}
		   			else
		   			{
		   				driver.findElement(By.xpath("(//a[text()='22'])[2]")).click();
		   				break;
		   			}
		   			FirstMonth = driver.findElement(By.xpath("//div[@class='monthBlock first']//span[@class='ui-datepicker-month']")).getText();
		   		    System.out.println("First Months...."+FirstMonth);
				   }
//		driver.findElement(By.xpath("//a[@class='nextMonth ']")).click();
		driver.findElement(By.xpath("//input[@id='ReturnDate']")).click();             //  //div[@class='monthBlock last']
		driver.findElement(By.xpath("//a[text()='29']")).click();
		WebElement wrpdwn = driver.findElement(By.xpath("//select[@id='Adults']"));
		Select sel = new Select(wrpdwn);
		sel.selectByValue("3");
		
		WebElement Childwrpdwn = driver.findElement(By.xpath("//select[@id='Childrens']"));
		Select sel1 = new Select(Childwrpdwn);
		sel1.selectByValue("2");

		WebElement Infantwrpdwn = driver.findElement(By.xpath("//select[@id='Infants']"));
		Select sel2 = new Select(Infantwrpdwn);
		sel2.selectByValue("2");
		  driver.findElement(By.xpath("//input[@id='SearchBtn']")).click();
		
	//	   System.out.println(todayDate+" "+NextDate);
		
	}
}
