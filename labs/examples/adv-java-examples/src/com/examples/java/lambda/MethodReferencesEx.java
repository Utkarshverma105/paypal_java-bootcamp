package com.examples.java.lambda;

import java.util.*;
import java.util.function.Supplier;

/**
 * Demonstrated method references usage
 */
public class MethodReferencesEx {

	
	public static void main(String[] args)
	{
		String[] countriesArr = {"India", "China", "Australia", "USA"};
		Collection<String> countries = Arrays.asList(countriesArr);

//		Map<String, String> countriesMap = new HashMap<>();
//		countriesMap.put("IND", "India");
//		countriesMap.put("CHN", "China");
//		countriesMap.put("AUS", "Australia");
//		countriesMap.forEach((key,value) -> System.out.println("Key: " + key + ", Value: " + value));
		
//		System.out.println("\nFor-each Loop..");
//		// Approach #1: for-each loop
//		for(String country: countries)
//		{
//			System.out.println(country);
//		}
//
//		System.out.println("\nIterator...");
//		// Approach #2: using iterator
//		Iterator<String> itr = countries.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
//
//		// Approach #3: using foreach and lambda expression
//		System.out.println("\nforeach method with lamda expression...");
//		countries.forEach(element -> System.out.println(element));
//
//		// Approach #4: using foreach and method reference
//		System.out.println("\nforeach method with method reference...");
//		countries.forEach(System.out::println);
//
//		// Accessing static methods
//		System.out.println("\nforeach method with lamda expression and static method...");
//		countries.forEach(item -> MethodReferencesEx.staticDisplayItem(item));
//
//		System.out.println("\nforeach method with method reference and static mehtod...");
//		countries.forEach(MethodReferencesEx::staticDisplayItem);
//
//		// Accessing instance methods
//		MethodReferencesEx obj = new MethodReferencesEx();
//		System.out.println("\nforeach method with lamda expression and instance method...");
//		countries.forEach(item -> obj.instanceDisplayItem(item));
//
//		System.out.println("\nforeach method with method reference and instance mehtod...");
//		countries.forEach(obj::instanceDisplayItem);
//
//		// Lambda expression to create ArrayList
//		Supplier<List<String>> createList = () -> {return new ArrayList<String>();};
//		List<String> citiList = createList.get();
//		System.out.println(citiList);
//
//		// Method Reference example to create ArrayList (invoking constructor)
//		Supplier<List<String>> createList1 = ArrayList::new;
//		List<String> citiList1 = createList1.get();
//		System.out.println(citiList1);


//		int initialCapacity = 10;
//		List<String> skills = new ArrayList<>(10);
//		List<String> skills1 = new ArrayList<>(10);
//		skills.add("Java");
//		skills.add("Python");
//		skills.add("Node JS");
//
//		System.out.println(skills);
//
//		List<Integer> capacities = new ArrayList<>();
//		capacities.add(10);

//		skills.forEach(ArrayList::new);

//		Supplier<List<String>> createList = (skills) -> {return new ArrayList<String>(skills);};



		
	}
	
	public static void staticDisplayItem(String item)
	{
		System.out.println(item);
	}
	
	public void instanceDisplayItem(String item)
	{
		System.out.println(item);
	}	
}
