import java.util.*;
import java.util.Map.Entry;
public class HashMapEx 
{
	public static void main(String[] args)
	{
		HashMap<String,String> hs=new HashMap<>();
		hs.put("13-11-1998","Padmini");
		hs.put("04-07-2004","Jyothi");
		hs.put("22-01-1964","Satish");
		hs.put("02-06-1967","Mani");
		
		System.out.println("Printing HashMap:");
		System.out.println("------------------------------");
		for (Entry<String, String> m:hs.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		
	}

}
