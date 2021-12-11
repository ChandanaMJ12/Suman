package Test.maven_project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Registertest extends Browser_setup {
	@DataProvider(name="TestData")
	public Object[][] testdata1(){
		Object[][] data=new Object[1][5];
		//1st iteration
		data[0][0]="cha";
		data[0][1]="A";
		data[0][2]="chandan@gmail.com";
		data[0][3]="123456";
		data[0][4]="123456";
		return data;
	}
	@Test(dataProvider="TestData")
	public void TC_01(String firstnames,String lastnames,String email,String password,String confirm ) throws IOException
	{
				
		WebElement register=driver.findElement(By.xpath("//a[text()='Register']"));
		Utility_fun.click_action(register);
		WebElement gender=driver.findElement(By.xpath("(//input[@name='Gender'])[2]"));
		Utility_fun.click_action(gender);
		
		WebElement firstname=driver.findElement(By.xpath("//input[@name='FirstName']"));
		Utility_fun.enter_keys(firstname,firstnames);
		WebElement lastname=driver.findElement(By.xpath("//input[@name='LastName']"));
		Utility_fun.enter_keys(lastname,lastnames);
		WebElement email1=driver.findElement(By.xpath("//input[@name='Email']"));
		Utility_fun.enter_keys(email1,email);
		
		WebElement password1=driver.findElement(By.xpath("//input[@name='Password']"));
		Utility_fun.enter_keys(password1,password);
		WebElement cpassword=driver.findElement(By.xpath("//input[@name='ConfirmPassword']"));
		Utility_fun.enter_keys(cpassword,confirm);
		WebElement button=driver.findElement(By.xpath("//input[@name='register-button']"));
		Utility_fun.click_action(button);
		

}
}
