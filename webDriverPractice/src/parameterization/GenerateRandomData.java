package parameterization;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomData {
	public static String randomInput(Integer reqChars, PermittedCharecters  permittedcharacters)
	{
		String  randomString ="";
		
		///alphabets  
		if(PermittedCharecters.ALPHABETS.equals(permittedcharacters))
		{
			randomString =randomAlphabets(reqChars);
		}
		///alphanumeric
		if(PermittedCharecters.ALPHANUMERIC.equals(permittedcharacters))
		{
			randomString=randomAlphaNumeric(reqChars);
		}
		////numeric  
		if(PermittedCharecters.NUMERIC.equals(permittedcharacters))
		{
			randomString=randomNumeric(reqChars);
		}
		
		///any data  
		if(PermittedCharecters.ANY_CHARECTERS.equals(permittedcharacters))
		{
			randomString = randomAnyCharacters(reqChars);
		}
		
		
		
		
		
		return randomString;
	}
	
	
	///generate random alphabets  
	public static  String randomAlphabets(Integer reqChars)
	{
		return RandomStringUtils.randomAlphabetic(reqChars);
		
	}
	////generate random alphanumeric
	public static String randomAlphaNumeric(Integer reqChars)
	{
		return RandomStringUtils.randomAlphanumeric(reqChars);
	}
	
	//generate random numeric
	public static String randomNumeric(Integer reqChars)
	{
		return RandomStringUtils.randomNumeric(reqChars);
	}
	
	///generate any characters  
	public static String randomAnyCharacters(Integer reqChars)
	{
		return  RandomStringUtils.random(reqChars, 48, 50, false, true);
		
	}

}
