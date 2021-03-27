import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEx extends Thread
{

	static CopyOnWriteArrayList<String> list=new CopyOnWriteArrayList<>();
	public void run()
	{
		list.add("Padmini");
	}
	public static void main(String[] args) throws InterruptedException
	{
		list.add("Satish");
		list.add("Mani");
		list.add("Jyothi");
		CopyOnWriteArrayListEx cp=new CopyOnWriteArrayListEx();
		cp.run();
		Thread.sleep(10000);
		Iterator iter =list.iterator();
		while(iter.hasNext())
		{
			String s=(String)iter.next();
			System.out.println(s);
			Thread.sleep(10000);
		}
		System.out.println(list);
	}

}
