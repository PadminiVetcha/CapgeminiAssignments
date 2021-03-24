class Person implements Comparable<Person> 
{
	int height,weight;
	String name;
	public Person(int height, int weight, String name) {
		super();
		this.height = height;
		this.weight = weight;
		this.name = name;
	}
	@Override
	public int compareTo(Person o) {
		if(weight>o.weight)
		{
			return 1;
		}
		else if(weight<o.weight)
		{
			return -1;
		}
		else
		{
			if(height>o.height)
			{
				return 1;
			}
			else if(height<o.height)
			{
				return 0;
			}
			else
			{
				return 0;
			}
		}
	}
}
