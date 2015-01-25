package sample;

public class App {
	public static void main( String[] args ) {
		NutritionFacts cocaCola = 
				new NutritionFacts.Builder(100, 8)
				.calories(100)
				.sodium(35)
				.carbohydrate(27)
				.build();
		Student s = new Student.Builder("taro", 15).favorite("Math").country("Japan").build();
		System.out.println(s.toString());
	}
}
