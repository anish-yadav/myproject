import java.util.*;
public class amicable {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("1st no. input::");
	int n1=sc.nextInt();
	System.out.println("2nd no. input::");
	int n2=sc.nextInt();
	int sumn1=0,sumn2=0;
	for(int i=1;i<=n1;i++) {
		if(n1%i==0) {
			sumn1=i++;
		}
		for( i=1;i<=n2;i++) {
			if(n2%i==0) {
				sumn2=i++;
			}
		}
			if(sumn1==sumn2) 
				System.out.println("amicable no..");
			
			else 
				System.out.println("not amicable no..");
			
		
	
}
}
}
