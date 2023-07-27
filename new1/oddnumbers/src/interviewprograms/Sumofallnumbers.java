package interviewprograms;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import jdk.jfr.Frequency;


public class Sumofallnumbers {
	
	public static void main(String args[])
	
	{
		// add all the number in list/array.
		List<Integer> liii = Arrays.asList(1,2,3,4,5,6,7);
		 
		 Optional<Integer> op = liii.stream().reduce((a,b) -> (a+b));
		 
		// average of all the numbers
		 double dk = liii.stream().mapToInt(e -> e).average().getAsDouble();
		 
		 
		System.out.println("sum of all numbers : "+op.get());
		System.out.println();
		 System.out.println("average of all numbers : "+dk);
		 System.out.println();
		 //square, fiter, average
		 
		 List<Integer> lk = Arrays.asList(0, 1,100,200,300,200,300,500,222,245,278,289,5, 501);
		 double duc = lk.stream().map(e -> e*e).filter(e -> e>=100).mapToInt(e ->e).average().getAsDouble();
		 
		 System.out.println("square, filter, average : "+duc);
		 System.out.println();
		 //filtring odd and even numbers
		 
		 List<Integer> llk = liii.stream().filter(e -> e%2==0).collect(Collectors.toList());
		 System.out.println("even numbers from list : "+llk);
		 System.out.println();
		 List<Integer> olk = liii.stream().filter(e -> e%2!=0).collect(Collectors.toList());
		 System.out.println("odd numbers from list : "+olk);
		 System.out.println();
		 //print numbers that starts with prefix 2
		 
		 
		 List<Integer> blk =lk.stream().map(e -> String.valueOf(e))
		               .filter(e -> e.startsWith("2"))
		                        .map(Integer::valueOf)
		                             .collect(Collectors.toList());
		 
		 System.out.println("elemnets starts with 2 : "+blk);
		 System.out.println();
		 
	    //print the numbers which is more than two times
		 
		 Set<Integer>setup = lk.stream().filter(e -> Collections.frequency(lk, e)>1).collect(Collectors.toSet());
		 
		 System.out.println("number which has more than one occurance "+setup);
		 System.out.println();
	
	
		//print the numbers which is more than two times USING set
		 Set<Integer> dupli = new HashSet<Integer>();
		 Set<Integer> duplio = lk.stream().filter(e ->!dupli.add(e)).collect(Collectors.toSet());
		 System.out.println("number which has more than one occurance using hashset "+duplio);
		 System.out.println();
		 
	
	     //find minimum and maximum number through stream
		 
		 int maximum = lk.stream().max(Comparator.comparing(Integer :: valueOf)).get();
		 System.out.println("maximum number "+maximum);
		 System.out.println();
		 int minimum = lk.stream().min(Comparator.comparing(Integer :: valueOf)).get();
		 System.out.println("minimum number "+minimum);
		 System.out.println();
		 
		 
		 //print the numbers in accending and descending order
		 
		 List<Integer> ascend = lk.stream().sorted().collect(Collectors.toList());
		 System.out.println("ascending order : "+ascend);
		 System.out.println();
		 List<Integer> descend=lk.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		 System.out.println("descending order : "+descend);
		 System.out.println();
		 
		 
		 
		 //get/ignore first 5 numbers
		 List<Integer> first_5 =lk.stream().limit(5).collect(Collectors.toList());
		 int add_first_five = lk.stream().limit(5).reduce((a,b)->(a+b)).get();
		 
		 List<Integer> ignoring_first_5 = lk.stream().skip(5).collect(Collectors.toList());
		 int ignore_and_add_first_five= lk.stream().skip(5).reduce((a,b)->(a+b)).get();
		 
		 
		 System.out.println("The first five numbers : "+first_5);
		 System.out.println();
		 System.out.println("The sum of five numbers : "+add_first_five);
		 System.out.println();
		 System.out.println("Ignoring first five numbers : "+ignoring_first_5);
		 System.out.println();
		 System.out.println("Ignoring and add first five numbers : "+ignore_and_add_first_five);
		 System.out.println();
		 
		 //second largest number
		 int second_largest_number = lk.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
		 System.out.println("The second largest number is : "+second_largest_number);
		 System.out.println();
		 int second_smallest_number = lk.stream().sorted().distinct().skip(1).findFirst().get();
		 System.out.println("The second smallst number is : "+second_smallest_number);
		 System.out.println();
	
	}
	
	


}
