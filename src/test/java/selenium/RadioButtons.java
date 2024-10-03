package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		
		//  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\chromedriver.exe");
		
	      WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	      
	      //WebElement element = driver.findElement(By.id("impressiveRadio"));
	      
	      String DesiredOutput="Round Trip";
	      
	      List <WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']//parent::td"));
	      int len=radio.size();
	      
	      for( int i=0;i<len;i++) {
	    	  System.out.println(radio.get(i).getText()); // checking elements are fetching or not
	    	  if(radio.get(i).getText().equals(DesiredOutput)) { 
	    		  radio.get(i).click();
	    	  }
	      }
	      

	}

}
