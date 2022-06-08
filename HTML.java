package Week5Day3Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HTML {

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
		
		//To get Row Size
		List<WebElement> row = driver.findElements(By.xpath("//div[@class='related-pages']//table//tr//td"));
        int size = row.size();
        System.out.println("Number of Row is"+" "+size);
        
        System.out.println("*******************************************");
       
        //To get column Size
        List<WebElement> column = driver.findElements(By.xpath("//div[@class='related-pages']//table//th"));
        int size2 = column.size();
        System.out.println("Number is Column is"+" "+size2);
        }
}
