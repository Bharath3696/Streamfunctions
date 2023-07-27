package oddnumbers;

import java.util.*;

public class arrange {
	
	public static void main(String args[])
	{
		System.out.println("enter the size of the array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[]arr = new int[size];
		for(int i =0;i<=size-1;i++)
		{
			System.out.println("enter the value for"+i+" th position");
			arr[i]= sc.nextInt();
		}
		
		for(int k : arr)
		{
			System.out.print(k+", ");
		}
		
		
		for(int j=0; j<=size-1; j++)
		{
			
			if(j%2 == 0)
			{
				for(int k =j+2;k<=size-1; k=k+2)
				{
					if(j>size+1)
					{
						break;
					}
					if(arr[j]<arr[k])
					{
						int temp= arr[j];
						arr[j]=arr[k];
						arr[k]=temp;
					}
					
					else
					{
						continue;
					}
				}
			}
		}
		
		System.out.println(" ");
		for(int g : arr)
		{
			System.out.print(g+", ");
		}
	}

}
