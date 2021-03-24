import java.io.*;
import java.util.*;
public class Client 
{
	public static void main(String[] args)
	{
		Persistence fp=new FilePesistence();
		fp.persist();
		Persistence dp=new DatabasePersistence();
		dp.persist();
	}
}
