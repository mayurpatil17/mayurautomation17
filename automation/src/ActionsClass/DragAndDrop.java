package ActionsClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/HP/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/dragdrop.html");  // DragAndDropLink
		Thread.sleep(2000);
		
		WebElement source = driver.findElement(By.id("draggable-2"));
		WebElement target = driver.findElement(By.id("droppable-2"));
		
		
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();  //perform is must.
	}

}
