package Test.maven_project;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Browser_setup{
public static WebDriver driver;
@BeforeClass
public void Setup() throws IOException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHASAVARAJ\\Desktop\\Selenium_Training\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.navigate().refresh();
	
	driver.get("http://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
	
	
}
@AfterClass
public void close(){
	driver.close();
}
}

