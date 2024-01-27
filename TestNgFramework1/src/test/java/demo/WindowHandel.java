package demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href=\"/windows/new\"]")).click();
		Set ids=driver.getWindowHandles();
		Iterator id=ids.iterator();
		String windows1=id.next().toString();
		String windwos2=id.next().toString();
		driver.switchTo().window(windwos2);
		driver.switchTo().window(windows1);
		driver.findElement(By.linkText("Elemental Selenium")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"docusaurus_skipToContent_fallback\"]/div[1]/h1")).getText();
		

	}

}
