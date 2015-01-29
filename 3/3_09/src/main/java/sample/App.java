package sample;

import java.util.HashMap;
import java.util.Map;

public class App {
	public static void main( String[] args ){
		PhoneNumber number1 = new PhoneNumber(111, 222, 333);
		PhoneNumber number2 = new PhoneNumber(111, 222, 444);
		Map<PhoneNumber,String> phoneMap = new HashMap<PhoneNumber, String>();
		
		phoneMap.put(number1, "taro");
		phoneMap.put(number2, "jiro");
		
		PhoneNumber number3 = new PhoneNumber(111,222,333);
		PhoneNumber number4 = new PhoneNumber(111,222,444);
		System.out.println(phoneMap.get(number1));
		System.out.println(phoneMap.get(number2));
		System.out.println(phoneMap.get(number3));
		System.out.println(phoneMap.get(number4));
		System.out.println("hashCode:" + number1.hashCode() + ":" + number3.hashCode());
		System.out.println("hashCode:" + number2.hashCode() + ":" + number4.hashCode());
		System.out.println(number1 == number1);
		System.out.println(number2 == number2);
		System.out.println(number1 == number3);
		System.out.println(number1.equals(number3));
		System.out.println(number2 == number4);
		System.out.println(number2.equals(number4));
	}
}
