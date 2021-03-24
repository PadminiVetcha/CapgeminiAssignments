import java.util.*;
public class ArrayListEx 
{
	public static void main(String[] args) 
	{
		List<Integer> li = new ArrayList<>();
		li.add(11);
		li.add(22);
		li.add(33);
		li.add(44);
		li.add(55);
		li.add(66);
		System.out.println("Printing ArrayList using foreach: ");
		for (Integer integer : li) {
			System.out.println(integer);
		}
		System.out.println("--------------------------------------");
		System.out.println("Printing ArrayList using ListIterator: ");
		ListIterator<Integer> iter=li.listIterator(6);
		while(iter.hasPrevious())
		{
			System.out.println(iter.previous());
		}

	}

}
