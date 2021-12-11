package Test.maven_project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility_fun extends Browser_setup{
	public static String Test_configurtion(String key) throws IOException
	{
		String filepath="./Test_configuration/Config.properties";
	FileInputStream  fis=new FileInputStream(filepath);
	
	 Properties prop=new Properties();
	 prop.load(fis);
	 String value=prop.getProperty(key);
	 return value;
	 
	}
	public static void enter_keys(WebElement ele,String value){
		ele.sendKeys(value);
	}
	public static void click_action(WebElement e)
	{
		e.click();
	}
	public static void select_by_index(WebElement element,int index){
		Select pos=new Select(element);
		pos.selectByIndex(index);
	}
	public static void select_by_value(WebElement element,String value){
		Select pos=new Select(element);
		pos.selectByValue(value);
	}
	public static void select_by_visibletext(WebElement element,String text){
		Select pos=new Select(element);
		pos.selectByVisibleText(text);
	}
	
	}
	
	

