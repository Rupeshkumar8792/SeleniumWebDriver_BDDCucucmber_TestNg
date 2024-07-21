package cucumberTestNg.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumberTestNg.base.BaseClass;

public class Util extends BaseClass
{
	static FileInputStream fis = null;
	static Properties prop;
	
	public static String readProperties(String key)
	{
		String path = System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties";
		
		try
		{
			fis = new FileInputStream(path);
			try
			{
				prop.load(fis);
			}
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop.getProperty(key);
	}
	
	public static File takeScreenshot() 
	{
		return ((TakesScreenshot)webDriver.get()).getScreenshotAs(OutputType.FILE);
		
	}
}
