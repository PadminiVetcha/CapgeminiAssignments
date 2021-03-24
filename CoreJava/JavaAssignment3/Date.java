import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;
import java.io.*;
public class Date 
{
	public static void compareDates(String a)
	{
		LocalDate x=LocalDate.parse(a);
		int day1=x.getDayOfMonth();
		Month m1=x.getMonth();
		int year1=x.getYear();
		System.out.println(day1+" "+m1+" "+year1);
		
	/*	LocalDate y=LocalDate.parse(b);
		int day2=y.getDayOfMonth();
		Month m2=y.getMonth();
		int year2=y.getYear();
		System.out.println(day2+" "+m2+" "+year2);*/
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String d1,d2;
		System.out.println("Enter the first date: ");
		d1=sc.next();
		//System.out.println("Enter the second date: ");
		//d2=sc.next();
		compareDates(d1);
	}

}
