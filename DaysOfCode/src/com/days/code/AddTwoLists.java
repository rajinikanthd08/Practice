package com.days.code;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AddTwoLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> list = new ArrayList<String>(Arrays.asList("ram","rahim","ravan"));

List<String> list1 = new ArrayList<String>(Arrays.asList("2ram","2ravan"));

List<String> l1 = Stream.of(list,list1).flatMap(a->a.stream()).collect(Collectors.toList());
		
		System.out.println(l1);
		
		
Map<String, List<String>>	data = new HashMap<>();
data.put("0rajni", Arrays.asList("1234","5678"));
data.put("1rajni", Arrays.asList("1234","3443"));


//List<String> maplist = data.values().stream().map(Collection::stream).collect(Collectors.toList());

data.entrySet().forEach(System.out::print);	


Stream<String> arr = Stream.of("tom","jerry","jack");
arr.map(e->e.length()).forEach(System.out::println);





}
		
		
	}


