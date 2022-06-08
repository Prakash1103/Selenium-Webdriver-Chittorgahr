package Week5Day3Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HTML2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//download the driver and setup the path
	    WebDriverManager.chromedriver().setup();
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		//get URL
		driver.get("https://html.com/tags/table/");
		//Maximize
		driver.manage().window().maximize();
		List<WebElement> one = driver.findElements(By.xpath("//div[@class='render']//table//tr//td"));
	    
		//Market Share values
		for (int i = 0; i <4; i++) {
			String text = one.get(i).getText();
			System.out.println(text);
			
		}
		
		System.out.println("*************************************");
		
		//Absolute Usage values
		for (int i = 4; i <8; i++) {
			String text2 = one.get(i).getText();
			System.out.println(text2);
			
		}
	}

}
