package interviewprograms;

public class StringtoCaptilize {
	
	
	public static String captilize(String inp)
	{
		if(inp == null)
		{
			System.out.println("you entered the null value");
			return inp;
		}
		
		else if(inp.length()==1)
		{
			String c = inp.toUpperCase();
			return c;
		}
		
		else
		{
		
		String[] wed = inp.split(" ");
		String result=" ";
		
		//System.out.println(wed.length);
		
		for(int i =0; i< wed.length; i++)
		{
			String first = wed[i].substring(0, 1).toUpperCase();
			String remaining = wed[i].substring(1).concat(" ");
			result = result+first+remaining;
			
		}
		
		return result.trim();
	}
	}
	
	
	
	
	public static void main(String args[])
	{
		String f =captilize("bharath kumaar rj");
		
		System.out.println(f);
		
		
		
		
	}

}
