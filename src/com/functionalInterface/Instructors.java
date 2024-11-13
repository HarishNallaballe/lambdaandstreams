package com.functionalInterface;

import java.util.Arrays;
import java.util.List;

public class Instructors {
	public static List<Instructor> getAll(){
		
		Instructor instructor1 = new Instructor("Mike",10,"software developer","male",true,Arrays.asList("java","Angular"));
		Instructor instructor2 = new Instructor("Harish",13,"software developer","male",true,Arrays.asList("java","react"));
		Instructor instructor3 = new Instructor("Prasad",10,"sales force","male",false,Arrays.asList("crm","salesforce"));
		Instructor instructor4 = new Instructor("Siva",5,"Big Data","male",true,Arrays.asList("spark","crm"));
		Instructor instructor5 = new Instructor("Mohan",10,"software developer","male",false,Arrays.asList("java","Azure"));

		List<Instructor> list=Arrays.asList(instructor1,instructor2,instructor3,instructor4,instructor5);
		return list;
	}

}
