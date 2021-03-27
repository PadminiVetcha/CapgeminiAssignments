@FunctionalInterface
interface Addition
{
	int add(int a,int b);
}
interface Subtract
{
	int sub(int a,int b);
}
interface Multiply
{
	int mul(int a,int b);
}
interface Divide
{
	int div(int a,int b);
}
public class LambdaEx1 
{
	public static void main(String[] args)
	{
		System.out.println("Addition:");
		Addition MyAdd=(a,b)->(a+b);
		System.out.println(MyAdd.add(100,50));
		
		System.out.println("Subtraction:");
		Subtract MySub=(a,b)->(a-b);
		System.out.println(MySub.sub(100,50));
		
		System.out.println("Multiplication:");
		Multiply MyMul=(a,b)->(a*b);
		System.out.println(MyMul.mul(100, 50));
		
		System.out.println("Division:");
		Divide MyDiv=(a,b)->(a/b);
		System.out.println(MyDiv.div(100,50));
	}
	
}
