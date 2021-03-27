import java.time.LocalDate;
import java.time.Month;
public class DateDob 
{	
	public static boolean checkDate(int dom1,Month m1,int y1,int dom2,Month m2,int y2)
	{
		if(dom1 == dom2)
		{
			if(m1==m2)
			{
				if(y1==y2)
				{
					return false;
				}
				return true;
			}
			return true;
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		LocalDate currentDate1 = LocalDate.of(1998, 11, 13); 
		int dom1 = currentDate1.getDayOfMonth();  
		Month m1 = currentDate1.getMonth(); 
		int y1 = currentDate1.getYear(); 
		//System.out.println("current local date : " + currentDate1);
		System.out.println("dayOfMonth from date in JDK 8: " + dom1); 
		System.out.println("month from a date in Java 1.8 : " + m1);
		System.out.println("year from date in JDK 1.8 : " + y1);
		System.out.println("---------------------------------------------------");
		LocalDate currentDate2 = LocalDate.of(2004, 07, 04); 
		int dom2 = currentDate2.getDayOfMonth();  
		Month m2 = currentDate2.getMonth(); 
		int y2 = currentDate2.getYear(); 
		//System.out.println("current local date : " + currentDate2);
		System.out.println("dayOfMonth from date in JDK 8: " + dom2); 
		System.out.println("month from a date in Java 1.8 : " + m2);
		System.out.println("year from date in JDK 1.8 : " + y2);
		boolean a=checkDate(dom1,m1,y1,dom2,m2,y2);
		System.out.println(a);
	}
}


