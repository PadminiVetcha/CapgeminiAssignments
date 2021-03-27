import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapFailFast 
{
	public static void main(String[] args) 
	{
		HashMap<String,String> hs=new HashMap<>();
		hs.put("13-11-1998","Padmini");
		hs.put("04-07-2004","Jyothi");
		hs.put("22-01-1964","Satish");
		hs.put("02-06-1967","Mani");
		
		System.out.println("Printing HashMap:");
		Iterator iter = hs.keySet().iterator();
		while(iter.hasNext())
		{
			System.out.println(hs.get(iter.next()));
			hs.put("14-04-20004", "abc");
		}
		
	}
}
