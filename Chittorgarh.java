package Week5Day3Assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittorgarh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//download the driver and setup the path
	    WebDriverManager.chromedriver().setup();
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		//get URL
		driver.get("https://www.chittorgarh.com/");
		//Maximize
		driver.manage().window().maximize();
		//click stock market
		driver.findElement(By.xpath("//a[@id='navbtn_stockmarket']")).click();
		//click Stock market
		driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
		
		//getting Security names
		List<WebElement> names = driver.findElements(By.xpath("//div[@class='table-responsive']//table//tr//td[3]"));
		
		//size 
		int size = names.size();
		
		//Empty list
		List<String> name3 =new ArrayList<String>();
		System.out.println("Security Names");
		
		//for loop
		for (int i = 0; i <size; i++)  { 
			  String text = names.get(i).getText();
		 //System.out.println(i+" "+ text);
			  name3.add(text);
			 }
		System.out.println(name3);
		
		//Size of empty list created
		int size2 = name3.size();
		System.out.println("size of list  "+size2);
		
		//size of set after converting from list
		Set<String> duplicate=new TreeSet<String>(name3);
		int size3 = duplicate.size();
		System.out.println("size of Set "+size3);
		
		if(size2!=size3) {
			System.out.println("Contains duplicate ");
		}
		else {
			System.out.println("Does not Contains Duplicate");
		}
	}
}
			
	    
		
			
			
			
			
			
			
			
			
			
			
			
			
			

	


