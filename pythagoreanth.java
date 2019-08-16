
public class pythagoreanth {
public static void main (String[]args)
{
	int s=1000;
	int x;
	int r=0;
	for(x=1;x<=s/3;x++) {
		int y;
		for(y=x+1;y<=s/2;y++) {
			int z=s-x-y;
			if(z>0 && (x*x+y*y==z*z))
			{
				System.out.printf("a=%d,b=%d,c=%d",x,y,z);
				r=x*y*z;
			}
		}
	}
	System.out.println(" product::"+r);
}
}
