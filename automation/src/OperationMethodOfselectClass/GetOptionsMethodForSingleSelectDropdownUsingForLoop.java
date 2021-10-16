package OperationMethodOfselectClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethodForSingleSelectDropdownUsingForLoop {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/HP/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/singleSelectDropdown.html");
		
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.id("menu"));
		Select sel = new Select(element);
		List<WebElement> options = sel.getOptions();
		
		//for loop
		for (int i=0;i<options.size();i++)
		{
			String textOfTheOption = options.get(i).getText();
			System.out.println(textOfTheOption);
		}
		
		
	}

}