package Test.maven_project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Logintest extends Browser_setup{
	@DataProvider(name="TestData")
	public Object[][] testdata()
	{
		Object [][] data=new Object[1][2];
		
		//1st
		data[0][0]="chandanamjmj@gmail.com";
		data[0][1]="chandana";
		return data;
	}
	@Test(dataProvider="TestData")
	public void Tc02(String email,String pwd) throws IOException
	{
	WebElement login=driver.findElement(By.xpath("//a[text()='Log in']"));
	Utility_fun.click_action(login);

	WebElement Email1=driver.findElement(By.xpath("//input[@name='Email']"));
	Utility_fun.enter_keys(Email1,email);
	
	WebElement password1=driver.findElement(By.xpath("//input[@name='Password']"));
	Utility_fun.enter_keys(password1,pwd);
	
	
	WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
	Utility_fun.click_action(checkbox);
	
	WebElement login1=driver.findElement(By.xpath("//input[@value='Log in']"));
	Utility_fun.click_action(login1);
	}

}
 
