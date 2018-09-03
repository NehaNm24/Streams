import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class StreamBasic {
	
	public List<Dish> getLowCaloryDishes(ArrayList<Dish> dishes){
		//calory<400
		//sort on names
		//print all with low calory
		List<Dish> lowcal=new ArrayList<>();
		Iterator<Dish> itr= dishes.iterator();
		while(itr.hasNext()) {
			Dish d=itr.next();
			int calory=d.getCalories();
			if(calory< 400) {
				lowcal.add(d);
			}
			
		}
		
		List <String> lowcalDishs =new ArrayList<>();
		
		return null;
		
	}
	
	public static List<String> getLowColoricDishesNamesInJava8(List<Dish> dishes){
		return dishes.stream()
				.filter(d -> d.getCalories() <400)
				.sorted(comparing(Dish:: getCalories))
				.map(Dish::getName)
				.collect(toList());
	}

	public static void main(String[] args) {
		
		//getLowCaloricDishesNamesInJava7(Dishes.menu).forEach(System.out::println);
		
		//System.out.println("----");
		List<String> names = getLowColoricDishesNamesInJava8(Dish.menu);
		System.out.println(names);
		

	}

}
