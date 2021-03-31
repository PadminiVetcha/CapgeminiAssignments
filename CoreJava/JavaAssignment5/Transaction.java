import java.util.List;

public class Transaction 
{
	private List<Trader> trader;
	private int year;
	private int value;
	
	public Transaction(List<Trader> trader, int year, int value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}

	public List<Trader> getTrader() {
		return trader;
	}

	public void setTrader(List<Trader> trader) {
		this.trader = trader;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Transaction [trader=" + trader + ", year=" + year + ", value=" + value + "]";
	}
	
	
	
	
}
