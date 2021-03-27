import java.util.HashMap;
import java.util.Map.Entry;

public class LambdaEx7
{

	public static void main(String[] args)
	{
		HashMap<Integer,String> hs=new HashMap<>();
		StringBuilder sb=new StringBuilder();
		hs.put(22, "Satish");
		hs.put(2, "Mani");
		hs.put(13, "Padmini");
		hs.put(4, "Jyothi");
		
		System.out.println("The elements in the hashmap are:");
		System.out.println(hs);

		System.out.println("After converting entire hashmap into a string, the result is:");
		for (Entry<Integer, String> m:hs.entrySet()) 
		{
			sb.append(m);
		}
		System.out.println(sb);
		
	}

}
