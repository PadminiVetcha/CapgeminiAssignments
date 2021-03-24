import java.util.*;
public class HashTableEx 
{
	public static void main(String[] args) 
	{
		Hashtable<EmployeeHashtable,String> ht= new Hashtable<>();
		EmployeeHashtable e1=new EmployeeHashtable("Padmini");
		EmployeeHashtable e2=new EmployeeHashtable("Jyothi");
		ht.put(e1, "One");
		ht.put(e2, "Two");
		System.out.println(ht);
		
	}

}
