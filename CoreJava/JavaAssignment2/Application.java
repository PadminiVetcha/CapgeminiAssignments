import java.util.Scanner;

public class Application 
{

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String r="No"; 
		System.out.println("Yes or No:");
		while(r!=sc.next())
		{
			//System.out.println("Yes or No:");
			System.out.println("Enter your role( 1 for Owner and 0 for customer )");
			int role=sc.nextInt();
			if(role==1)
			{
				System.out.println("Item u want to add(1 for icecream 0 for candy:)");
				int a=sc.nextInt();
				if(a==1)
				{
					IceCream ic=new IceCream();
					System.out.println("Enter the no of items to add:");
					int k=sc.nextInt();
					int b=ic.add(k);
					System.out.println(b);
					System.out.println("Count of Icecream is "+b);
				}
				else
				{
					Candy c=new Candy();
					System.out.println("Enter the no of items to add:");
					int s=sc.nextInt();
					int z=c.add(s);
					System.out.println("Count of candy is "+z);
				}
			}
			else
			{
				System.out.println("Item u want to order(1 for icecream 0 for candy:)");
				int a=sc.nextInt();
				if(a==1)
				{
					IceCream ic1=new IceCream();
					ic1.getCost();
				}
				else
				{
					Candy c1=new Candy();
					c1.getCost();
				}
				
			}
		}
	}

}
