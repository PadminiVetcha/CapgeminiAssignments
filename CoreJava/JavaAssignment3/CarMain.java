
public class CarMain {

	
	public static void main(String[] args) 
	{
		
		ParkedCarOwnerList p=new ParkedCarOwnerList();
		ParkedCarOwnerDetails d=new ParkedCarOwnerDetails("Padmini","1234",23456,98765432,"Vzm");
		p.addNewCar(d, 13);
		p.removeCar(2);
		p.getParkedCarLocation(13);

	}

}
