
public class Candy extends DessertShop {

	int tax,count=0;
	public void getCost()
	{
		int cost=20;
		System.out.println("The cost of Candy is $"+(cost));	
		int r=20*60;
		System.out.println("Cost in rupees:"+r);
	}
	public int add(int x) 
	{
		count=count+x;
		return count;
	}
}
