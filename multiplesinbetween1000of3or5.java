public class multiplesinbetween1000of3or5
{
	public static void main(String[]args)
	{
		 int sum=0;
		 System.out.println("All multiples of 3 or 5 ::");
	   for(int i=3;i<1000;i++)
	   {	
		 if(i%3==0 || i%5==0)
		 {
			System.out.println("numbers are ::"+i);
			sum=sum+i; 
		 }
	   }
	   System.out.println("Sum of all multiples of 3 or 5::"+sum);
	 }
	
}
