import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsAssignment 
{
	public static void main(String[] args) 
	{
		List<Fruit> fruitList = Arrays.asList(
				new Fruit("Pomogranate",100,90,"Red"),
				new Fruit("Apple", 52, 70, "Red"),
				new Fruit("Mango", 60, 50, "Yellow"),
				new Fruit("Banana", 89, 30, "Yellow"),
				new Fruit("Avacado",322,100,"Green"));
		
		System.out.println("----------------1.Fruits with less than 100 calories in descending order--------------");
		fruitList.stream()
			.filter(f->f.getCalories()<100)
			.sorted(Comparator.comparing(Fruit::getCalories).reversed())
			.forEach(System.out::println);
		
		System.out.println("----------------2.Fruits group by color------------------");
		Map<String, List<Fruit>> grpByColor=
		fruitList.stream()
			.collect(Collectors.groupingBy(Fruit::getColor));
		System.out.println(grpByColor);
		
		System.out.println("----------------3.Fruits group by red color in ascending order------------------");
		fruitList.stream()
			.filter(p->p.getColor().equalsIgnoreCase("red"))
			.sorted(Comparator.comparing(Fruit::getPrice))
			.forEach(System.out::println);
		
		//List of Comments
		List<String> li1=new ArrayList<>();
		li1.add("Good");
		li1.add("Nice");
		li1.add("Great Research");
		List<String> li2=new ArrayList<>();
		li2.add("budget");
		List<String> li3=new ArrayList<>();
		li3.add("Good");
		li3.add("Great Work");
		
		//List of people who commented
		List<String> c1=new ArrayList<>();
		c1.add("Ram Kumar");
		c1.add("Namratha");
		c1.add("Darsh");
		List<String> c2=new ArrayList<>();
		c2.add("Jyothi");
		List<String> c3=new ArrayList<>();
		c3.add("Ram");
		c3.add("Nandini");
		
		List<News> newsList = new ArrayList<>();
		newsList.add(new News(1,"Padmini",c1,li1));
		newsList.add(new News(2,"Jyothi",c2,li2));
		newsList.add(new News(3,"Mani",c3,li3));
		
		System.out.println("----------------4.Newsid with maximum comments------------------");
				
		Optional<Object> mostCommonID = newsList.stream()
                .collect(Collectors.groupingBy(News::getNewsId, Collectors.counting()))
                // fetch the max entry
                .entrySet().stream().max(Map.Entry.comparingByValue())
                // map to tag
                .map(Map.Entry::getKey);
        System.out.println(mostCommonID);
		
		System.out.println("----------------5.Number of times budget arrived in comments------------------");
		long x=newsList.stream()
				.flatMap(p->p.getComment().stream())
				.filter(p->p.equalsIgnoreCase("budget"))
				.count();
		System.out.println(x);
		
		System.out.println("----------------6.User who posted maximum comments------------------");
		
		Integer newsId=newsList.stream()
				.collect(Collectors.groupingBy((News n)->n.getNewsId(),Collectors.counting()))
				.entrySet()
				.stream()
				.max(Map.Entry.comparingByValue()).get().getKey();
		System.out.println(newsId); 
		
		System.out.println("----------------7.CommentByUser wise number of comments-----------------");
		Map<List<String>, Long> comm=newsList.stream()
								.collect(Collectors.groupingBy((News n)->n.getCommentByUser(),Collectors.counting()));
		System.out.println(comm); 
		
		List<Trader> t1=new ArrayList<>();
		t1.add(new Trader("Padmini","Indore"));
		t1.add(new Trader("Jyothi","Pune"));
		t1.add(new Trader("Mani","Pune"));
		
		List<Trader> t2=new ArrayList<>();
		t2.add(new Trader("Anika","Vzm"));
		t2.add(new Trader("Shiv","Delhi"));
		t2.add(new Trader("Meera","Vizag"));
		
		List<Trader> t3=new ArrayList<>();
		t3.add(new Trader("Gauri","Pune"));
		t3.add(new Trader("Madhu","Banglore"));
		
		//System.out.println(t1);
		//System.out.println(t2);
		//System.out.println(t3);
		
		List<Transaction> trans= new ArrayList<>();
		trans.add(new Transaction(t1,2011,95000));
		trans.add(new Transaction(t2,2003,23460));
		trans.add(new Transaction(t3,2011,59800));
		
		//System.out.println(trans);
		
		System.out.println("----------------8.All transcations in year 2011 and sorted based on value-----------------");
		trans.stream()
			.filter(p->p.getYear()>2010 && p.getYear()<2012)
			.sorted(Comparator.comparing(Transaction::getValue))
			.forEach(System.out::println);
		
		System.out.println("----------------9.Unique cities where traders work-----------------");
		trans.stream()
				.flatMap(p->p.getTrader().stream())
				.filter(distinctByKey(p->p.getCity()))
				.forEach(c->System.out.println(c.getCity())) ;
		
		System.out.println("----------------10.Traders from pune and sort by name-----------------");
		trans.stream()
				.flatMap(a->a.getTrader().stream())
				.filter(p->p.getCity().equalsIgnoreCase("pune"))
				.sorted(Comparator.comparing(Trader::getName))
				.forEach(System.out::println);
		
		System.out.println("----------------11.Strings of traders sorted alphabetically-----------------");
		trans.stream()
			.flatMap(p->p.getTrader().stream())
			.filter(distinctByKey(p->p.getName()))
			.sorted(Comparator.comparing(Trader::getName))
			.forEach(System.out::println);
		
		System.out.println("----------------12.Any traders from Indore--------------------");
		trans.stream()
			.flatMap(a->a.getTrader().stream())
			.filter(p->p.getCity().equalsIgnoreCase("indore"))
			.forEach(System.out::println);
		
		System.out.println("----------------13.Transaction's values from traders living in delhi--------------------");
		trans.stream()
			.flatMap(a->a.getTrader().stream())
			.filter(p->p.getCity().equalsIgnoreCase("delhi"))
			.collect(Collectors.toList())
			.forEach(System.out::println);
		
		//trans.stream()
		//.filter((Transaction t)->t.getTrader().getCity().equals("Delhi"))
		//.collect(Collectors.toList());
		
		System.out.println("----------------14.Highest value of all transactions--------------------");
		Transaction maxValue=trans.stream()
				.max(Comparator.comparing(Transaction::getValue))
				.get();
		System.out.println(maxValue);
		
		System.out.println("----------------15.Least value of all transactions--------------------");
		Transaction minValue=trans.stream()
				.min(Comparator.comparing(Transaction::getValue))
				.get();
		System.out.println(minValue);
	}
	public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) 
	{
	    Map<Object, Boolean> map = new ConcurrentHashMap<>();
	    return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
	}
}
