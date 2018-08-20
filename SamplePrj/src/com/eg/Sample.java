package com.eg;

import java.util.ArrayList;
import java.util.Comparator;

public class Sample {

	Comparator<Employee> sortByName = new Comparator<Employee>() {
		@Override
		public int compare(Employee e1, Employee e2) {
			return e1.getName().compareTo(e2.getName());
		}
	};
	
	public static void main(String[] args) {
		// Initial data
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(500, "Shifoo", 150000));
		list.add(new Employee(504, "Oogway", 120000));
		list.add(new Employee(503, "Tigress", 100000));
		list.add(new Employee(730, "Mantis", 45000));

		System.out.println("Initial List :");
		//list.forEach(al -> System.out.println(al));
		list.stream().forEach(al -> System.out.println(al));
		
		System.out.println("\n==== Lambda Method Reference ====");
		 
        list.forEach(System.out::println);
 
 
        System.out.println("\n==== Lambda Method Reference 2 ====");
 
        list.forEach(Emp::countWord);
		

	}
	
}

class Emp {
    static void countWord(Employee e) {
        System.out.println(e.toString());
    }
}
