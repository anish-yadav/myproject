import java.util.Scanner;

public class powersum{
	static int cal(int n,int power) {
		int s=0;
		int base=(int) Math.pow(n,power);
		while(base!=0) {
			int d=base%10;
			s+=d;
			base/=10;
		}
		return s;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no..");
		int n=sc.nextInt();
		System.out.println("enter power of the no..");
		int power=sc.nextInt();
		System.out.println(cal(n,power));
	}
}