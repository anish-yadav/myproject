import java.util.*;
import java.io.*;

public class largestprimefactor
{
	public static void main(String[]args) 
	{
	int n,c = 0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value to determine prime factor::");
	n=sc.nextInt();
	if(n>=1 && n<=(Math.pow(10,5)))
		for(int i=1;i<n;i++)
		{
			if(n%2==0)
			{
				c++;
			 if(c==2)
			 {
			    int t=0;
				if(t<i)
				{
				System.out.println("Largest prime number::"+i);	
				}
			 }
			}
		}
	}
}