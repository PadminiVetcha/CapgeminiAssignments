import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

class MyOperator implements UnaryOperator<String>
{
	@Override
	public String apply(String t) 
	{
		return t.toUpperCase();
	}
}
public class LambdaEx6 
{	
	public static void main(String[] args)
	{
		List<String> li=new ArrayList<>();
		li.add("Satish");
		li.add("Mani");
		li.add("Padmini");
		li.add("Jyothi");
		System.out.println("Elements in list are:");
		System.out.println(li);
		li.replaceAll(new MyOperator());
		System.out.println("Elements in list after replacing with upper case letters are:");
		System.out.println(li);
		
	}

}
