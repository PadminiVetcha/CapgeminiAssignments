class EmployeeHashtable
{
	public String name;
	public EmployeeHashtable(String name) {
		super();
		this.name = name;
	}
	public boolean equals(Object obj)
	{
		return true;
	}
	public int hashCode()
	{
		int a=13;
		return a;
	}
	public String toString()
	{
		return "Name of employee: " +name;
		
	}
}
