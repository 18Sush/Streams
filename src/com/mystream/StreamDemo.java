package com.mystream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.stream.DoubleStream;
import java.util.Random;
import java.util.stream.*;
import java.util.*;
public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		//1. Create stream using collection
		
		List<String> collection=Arrays.asList("Connector","BSC","TelePrinter","Terminal","Modems");
		Stream<String> stream=collection.stream();
		stream.forEach(System.out::println);
		
		//2. Create a stream from specified values
		
		Stream<String> stream=Stream.of("Connector","BSC","TelePrinter","Terminal","Modems");
		
		//3. Create a stream from array
		
		String[] arr= {"Connector","BSC","TelePrinter","Terminal","Modems"};
		Stream<String> =Arrays.stream(arr);
		
		//4. Create stream using streamof
		
		String[] arr= {"Connector","BSC","TelePrinter","Terminal","Modems"};
		Stream<String> stream=Stream.of(arr);
		Stream<String> empty=stream.empty();
		
		// 5. Create stream using builder function
		
		Stream.Builder<String> builder=Stream.builder();
		builder.add("Modem");
		builder.add("Terminal");
		Stream<String> stream=builder.build();
		
		//6. Create stream using an iterate method
		
		Stream<Integer> intstream=Stream.iterate(1, n->n+2).limit(15);
		intstream.forEach(System.out::println);
		
		//7. IntStream
		
		IntStream intStream=IntStream.of(10,12,34,55,65);
		intStream.forEach(System.out::println);
	
		IntStream intStream=IntStream.range(1, 5);
		intStream.forEach(System.out::println);
		IntStream closeStream=IntStream.rangeClosed(1, 5);
		closeStream.forEach(System.out::println);
		
		DoubleStream doubleStream=DoubleStream.of(12,13,45,6.90);
		
		
		//8. Generate function in string
		Stream<String> stream=Stream.generate(()->"Helloo World").limit(10);
		stream.forEach(System.out:: println);
		
		//9. Generate function in intstring taking random
		IntStream stream=IntStream.generate(()->new Random().nextInt(10)).limit(10);
		stream.forEach(System.out:: println);
		
		//10. allMatch match the provided condition
		Stream<Integer> stream=stream.of(23,45,67,43,43);
		System.out.println(stream.allMatch((e)->e%2==0);
		
		//11. anymatch
		System.out.println(stream.anyMatch((e)->e%2==0);
		
		//12. concact and count
		Stream <Integer> stream1=Stream.of(11,23,45,46);
		Stream <Integer> stream2=Stream.of(12,34,56,78);
		
		Stream <Integer> stream3=Stream.concat(stream1,stream2);
		stream3.forEach(System.out::println);
		
		System.out.println(stream3.count());
		
		//13. distinct
		Stream stream=Stream.of("Connector","BSC","TelePrinter","Terminal","Modems");
		stream.distinct().forEach(System.out::println);
		
		//14. filter
		Stream stream=Stream.of(13,45,443,35,54,56,67,32,32);
		stream.filter((e)->c>15).forEach(System.out::println);
		
		//15. findAny
		Stream stream=Stream.of(13,45,443,35,54,56,67,32,32);
		System.out.println(stream.findAny().get());
		System.out.println(stream.findFirst().get());
		
		//16. Map function
		Stream stream=Stream.of(10,11,15,23,11,34,56,77,54);
		stream.map((e)->e*e).forEach(System.out::println);
		*/
		
	}

}
