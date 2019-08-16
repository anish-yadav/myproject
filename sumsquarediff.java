
public class sumsquarediff {
public static void main(String[]args)
{
	int sum=0,s=0;
	int sqr=0;
	int diff=0;
	for(int i=1;i<=100;i++)
	{
		s=s+i;
		sum=sum+(i*i);
	}
	sqr=s*s;
	System.out.println("Difference between sum of squares and square of sum is::"+(sqr-sum));
	
}
}
