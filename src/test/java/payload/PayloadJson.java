package payload;

import java.util.HashMap;
import java.util.Map;

public class PayloadJson {
	
	public static String nameJson(String name, String lname, String gmail)
	
	{
	
		return "{\r\n"
				+ "    \"firstname\": \""+name+"\",\r\n"
				+ "    \"lastname\": \""+lname+"\",\r\n"
				+ "    \"emailID\": \""+gmail+"\"\r\n"
				+ "}";
	}


	
}
