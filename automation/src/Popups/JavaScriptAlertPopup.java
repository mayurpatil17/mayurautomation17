package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlertPopup {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/HP/Desktop/Selenium/JavascriptAlertPopup.html");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[.='Try it']")).click();
	Alert al = driver.switchTo().alert();
	Thread.sleep(4000);
	al.accept();
}
}
