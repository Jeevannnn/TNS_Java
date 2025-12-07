package com.tnsif.Streambasics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasicsDemo {

		public static void main(String[] args) {
			Stream<Integer> stream=Stream.of(10,20,30,40,50);
			
			//counting no of objects in the stream
//			System.out.println("no of objects in stream are"+stream.count());
			
			System. out.println ("Distinct Elements are : ");
			stream.distinct().forEach(System.out :: println);
			System. out.println ("No of Distinct Elements are : ");
//			System.out.println(stream.distinct().count());
//			System.out.println("First 2 elements:");
//			Stream.limit(2).forEach(System.out::println);
			
			
			Integer[] values=new Integer[] {100,200,300,400,50,60,70,80,90,100,110};
			stream=Arrays.stream(values);
			
			System.out.println("Squares of " +Arrays.toString(values)+ " is as follows: ");
			stream=stream.map(m->m*m);
//			stream.forEach(System.out::println);
			
			System.out.println("First 2 elements:");
			stream.limit(2).forEach(System.out::println);
			
			Stream<String> stream1;
//			List<String> words = new ArrayList<>();
//			words.add("Hello");
//			words.add("Stream");
			
			List<String> words = Arrays.asList("Hello","Stream","Learning");
			System.out.println(words);
			stream1=words.stream();
//			stream1.forEach(System.out::println);
			
			// to uppercase
			
			System.out.println("Strings to uppercase:");
			List<String> s1 = stream1.map(str -> str.toUpperCase()).collect(Collectors.toList());
			System.out.println(s1);
			
			
		}

	}	

