package demo;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrangeHRM {
	static WebDriver driver;
	@BeforeMethod

	public static void main(String[] args) throws InterruptedException {
		{
			
		XSSFWorkbook wo=new XSSFWorkbook();
		XSSFSheet sh=wo.createSheet("Logindata");
		XSSFRow    r=sh.createRow(0);
		          
		
		
     
	}
	}
}
