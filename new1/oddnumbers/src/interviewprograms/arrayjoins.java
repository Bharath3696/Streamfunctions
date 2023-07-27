package interviewprograms;

import java.util.Arrays;
import java.util.stream.Collectors;

public class arrayjoins {
	
	public static void main(String args[])
	{
		
		String[] arr= {"b","h","a","r","a","t","h"};
		
		String oo = String.join("", arr);
		
		System.out.println(oo);
		
	

// Join using stream
	
	String o1= Arrays.asList(arr).stream().collect(Collectors.joining(""));
	
	System.out.println(o1);
	
	System.out.println(joinit("#", arr));
	System.out.println(intit("-", 1,2,3,4,5));
	
	}
	
	// join using String builder
	
		public static String joinit(String sep, String...args)
		{
		     StringBuilder sb = new StringBuilder();
		     int end =0;
		     for(String s : args)
		     {
		    	 if(s!=null) 
		    	 {
		    	   sb.append(s);
		    	   end = sb.length();
		    	   sb.append(";");
		    	   
		    	 }
		     }
		     
		     String g= sb.substring(0, end);
		    return g;
		}
		
		public static String intit(String sep, int...args)
		{
		     StringBuilder sb = new StringBuilder();
		     int end =0;
		     for(Integer s : args)
		     {
		    	 if(s!=null) 
		    	 {
		    	   sb.append(s);
		    	   end = sb.length();
		    	   sb.append(";");
		    	   
		    	 }
		     }
		     
		     String g= sb.substring(0, end);
		    return g;
		}

	
}
