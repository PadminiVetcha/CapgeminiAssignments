interface Order
{
	void result(int price,String status);
}
public class LambdaEx2 
{
	public static void main(String[] args)
	{
		Order MyOrder=(price,status)->{
			if(price>10000) {
				if(status=="ACCEPTED" || status=="COMPLETED")
				{
					System.out.println("Order Printed");
				}
			}
			else
			{
				System.out.println("Order is not printed");
			}
		};
		MyOrder.result(5000, "COMPLETED");
		MyOrder.result(5000000, "COMPLETED");
		MyOrder.result(50, "ACCEPTED");
		MyOrder.result(150000, "ACCEPTED");

	}

}
