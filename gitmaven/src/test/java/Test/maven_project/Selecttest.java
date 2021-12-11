package Test.maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Selecttest extends Browser_setup{
	@DataProvider(name="TestData")
	public Object[][] testdata1(){
		Object[][] data=new Object[1][1];
		//1st iteration
		data[0][0]=2;
		
		return data;
	}
@Test(dataProvider="TestData")
public void Tc03(int index)
{
	WebElement books=driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]"));
	Utility_fun.click_action(books);
	
	WebElement position=driver.findElement(By.xpath("//select[@id='products-orderby']"));
	Utility_fun.select_by_index(position,index);
}
}
