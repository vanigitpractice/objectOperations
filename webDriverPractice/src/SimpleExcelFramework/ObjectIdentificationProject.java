package SimpleExcelFramework;

import org.openqa.selenium.By;

public class ObjectIdentificationProject {
	//identify the object using id,name,linktext,css selector,xpath
	public static By myLocator;
	public static By objProcess(String propName, String propValue)
	{
		if(propName.equalsIgnoreCase("name"))
		{
			myLocator= By.name(propValue);
		}
		else if(propName.equalsIgnoreCase("id"))
		{
			myLocator= By.id(propValue);
		}
		else if(propName.equalsIgnoreCase("linkText"))
		{
			myLocator= By.linkText(propValue);
		}
		else if(propName.equalsIgnoreCase("cssSelector"))
		{
			myLocator= By.cssSelector(propValue);
		}
		else if(propName.equalsIgnoreCase("xpath"))
		{
			myLocator=By.xpath(propValue);
		}
		return myLocator;
	}
	

}
