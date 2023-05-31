package week3.day1.homeassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditUsingXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/login");
 		driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 		driver.findElement(By.xpath("//form[@id='login']//input")).sendKeys("Demosalesmanager");
 		driver.findElement(By.xpath("(//form[@id='login']//input)[2]")).sendKeys("crmsfa");
 		driver.findElement(By.xpath("(//form[@id='login']//input)[3]")).click();
 		driver.findElement(By.xpath("//div[@id='label']/a")).click();
 		driver.findElement(By.xpath("(//div[@class='x-panel-header']/a)[2]")).click();
 		driver.findElement(By.xpath("(//ul[@class='shortcuts']//a)[2]")).click();
 		driver.findElement(By.xpath("//div[@class='fieldgroup-body']//input")).sendKeys("Barclays");
 		driver.findElement(By.xpath("//td[@class='label']/following::input[@id='createLeadForm_firstName']")).sendKeys("Padma");
 		driver.findElement(By.xpath("//td[@class='label']/following::input[@id='createLeadForm_lastName']")).sendKeys("R");
 		driver.findElement(By.xpath("//td[@class='label']/following::input[@class='smallSubmit']")).click(); 	
 		driver.findElement(By.xpath("(//div[@class='frameSectionExtra']/a)[3]")).click(); 
 		driver.findElement(By.xpath("//div[@class='fieldgroup-body']//input")).clear();
 		driver.findElement(By.xpath("//div[@class='fieldgroup-body']//input")).sendKeys("JPMorgan");
 		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
 		
 		

	}

}
