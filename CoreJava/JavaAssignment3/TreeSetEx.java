import java.util.*;
public class TreeSetEx 
{
	public static void main(String[] args)
	{
		Set<Person> ts=new TreeSet<>();
		Person p1=new Person(10,20,"Satish");
		Person p2=new Person(20,40,"Mani");
		Person p3=new Person(30,60,"Padmini");
		Person p4=new Person(40,80,"Jyothi");
		
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		ts.add(p4);
		for (Person person : ts) {
			System.out.println(person.name);
		}
	}
}
