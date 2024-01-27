package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import graphql.PublicApi;

public class Framework {
	WebDriver driver;
	@BeforeTest

	public void url() {
		
		System.out.println("browser");
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://hms.kareclouds.com/site/login");
	   driver.findElement(By.name("username")).sendKeys("superadmin@gmail.com");
	   driver.findElement(By.name("password")).sendKeys("Admin@123");
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test(priority = 1)
	public void sai() {
	   String title=driver.getTitle();
	   System.out.println(title);
	
	}
	@Test(priority = 2)
	public void Search() {
		driver.findElement(By.name("search_text")).sendKeys("sai");
		driver.findElement(By.xpath("(//i[@class='fa fa-search'])[1]")).click();
	}

	@Test(priority =3)
	public void language() {
		driver.findElement(By.xpath("(//span[@class='flag-icon flag-icon-us'])[1]")).click();
	}
	
	@Test(priority = 4)
	public void notifications() {	
		driver.findElement(By.xpath("//i[@class='fa fa-bell-o']")).click();
	}
	@Test(priority=5)
	public void bedstatus() {
		driver.findElement(By.xpath("//span[@class='spanDM']")).click();
	}
	@Test(priority=6)
	public void calendar() {
		driver.findElement(By.xpath("//i[@class='fa fa fa-calendar']")).click();
	}
	@Test(priority=7)
	public void task() throws InterruptedException {
        driver.findElement(By.xpath("//i[@class='fa fa-check-square-o']")).click();
	Thread.sleep(3000);
	}
	@Test(priority=8) 
	public void Frontoffice() throws InterruptedException {
		driver.findElement(By.xpath("//i[@class='fas fa-dungeon']")).click();
		Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section/div/div/div/div[1]/div/a[1]")).click();
        Thread.sleep(3000);       
        driver.findElement(By.id("date")).click();
		driver.findElement(By.id("patient_name")).sendKeys("sai");
		driver.findElement(By.id("gender")).click();
		driver.findElement(By.xpath("//option[@value='Female'][1]")).click();
		driver.findElement(By.id("email")).sendKeys("sainaidukanakala@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("12345678");
		driver.findElement(By.xpath("//span[@id='select2-doctorid-container']"));
		driver.findElement(By.xpath("(//option[@value='4'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='select2-selection__rendered']")); 
		driver.findElement(By.xpath("(//option[@value='4'])[3]")).click();
		Thread.sleep(2000); 
		driver.findElement(By.id("note")).sendKeys("Testing Engineer");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//select[@name='appointment_status'])[1]"));
		driver.findElement(By.xpath("(//option[@value='cancel'])[1]")).click();
		Thread.sleep(2000); 
		driver.findElement(By.xpath("(//select[@name='live_consult'])[1]"));	 
		driver.findElement(By.xpath("(//option[@value='Yes'])[1]")).click();
		Thread.sleep(2000);
    	driver.findElement(By.xpath("//button[@id='formaddbtn']")).click();
		 
	      }
	
	@Test(priority=9)
	public void visitorbook() throws InterruptedException {
		
		driver.findElement(By.xpath("//i[@class='fas fa-dungeon']")).click();
		
		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-sm']")).click();
		 
		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-sm addvisitor']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//select[@class='form-control'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//option[@value='Visit Aditya'])[2]")).click();
		
		driver.findElement(By.xpath("(//input[@class='form-control'])[6]")).sendKeys("SaiBorusu");
		
		driver.findElement(By.xpath("(//input[@class='form-control'])[7]")).sendKeys("7093786556");
		
		driver.findElement(By.xpath("(//input[@class='form-control'])[8]")).sendKeys("123456");
		
		driver.findElement(By.xpath("(//input[@class='form-control'])[9]")).sendKeys("10");
		
		driver.findElement(By.id("date")).sendKeys("31-12-2023");
		
		driver.findElement(By.id("stime_")).sendKeys("9:00PM");
		
		driver.findElement(By.xpath("(//input[@class='form-control timepicker'])[4]")).sendKeys("6:00PM");
		
		driver.findElement(By.id("description")).sendKeys("manual testing");
		Thread.sleep(5000);
    
    	Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='submit'])[4]")).click();
		
		
			
		
		
		
		
	}
	@Test(priority=10)
	public void phonecalllog() throws InterruptedException {
		driver.findElement(By.xpath("//i[@class='fas fa-dungeon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='btn btn-primary btn-sm'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-sm call_log']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@class='form-control'])[6]")).sendKeys("raju");
		
		driver.findElement(By.xpath("(//input[@class='form-control'])[7]")).sendKeys("9848022338");
		
		driver.findElement(By.id("date")).sendKeys("03-01-2024");
		
		driver.findElement(By.id("description")).sendKeys("automation");
		
		driver.findElement(By.id("follow_up_date")).sendKeys("10-01-2024");
		
		driver.findElement(By.xpath("(//input[@class='form-control'])[10]")).sendKeys("10 min");
		
		driver.findElement(By.id("description")).sendKeys("manual");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@value='Outgoing'])[2]")).click();
		
		driver.findElement(By.id("formaddbtn")).click();
	}
      @Test(priority=11)
      public void Postal() throws InterruptedException {
    	  driver.findElement(By.xpath("//i[@class='fas fa-dungeon']")).click();
    	  Thread.sleep(3000);
    	  driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm dropdown-toggle']")).click();
    	  Thread.sleep(3000);
    	  driver.findElement(By.xpath("//li[@class='es-selectable']")).click();
    	  Thread.sleep(3000);
    	  driver.findElement(By.xpath("//a[@class='btn btn-primary btn-sm receive']")).click();
    	  Thread.sleep(3000);
    	  driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("IT Vidhya");
    	  
    	  driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("10");
    	  
    	  driver.findElement(By.id("description")).sendKeys("Mahindra Residency, Flat No: 401, 4th Floor, Ameerpet, Hyderabad ");
    	  
    	  driver.findElement(By.id("description")).sendKeys("automation testing");
    	  
    	  driver.findElement(By.xpath("(//input[@class='form-control'])[3]")).sendKeys("IT Vidhya");
    	  
    	  driver.findElement(By.id("date")).sendKeys("04-01-2024");
    	  Thread.sleep(3000);
      }
      
		
	
	@AfterTest
	public void close() {
		driver.quit();
	}
	
}

