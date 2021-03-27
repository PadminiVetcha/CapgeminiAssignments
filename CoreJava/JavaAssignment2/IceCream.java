
public class IceCream extends DessertShop {
	int tax,count=0;
	public void getCost()
	{
		int cost=50;
		System.out.println("The cost of IceCream is Rs."+cost);			
	}
	public int add(int x) 
	{
		count=count+x;
		return count;
	}

}
