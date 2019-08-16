import java.util.*;
public class sumoffactorialdigit {
public static int sol(int n) {
	long fact=1;
	for(int i=1;i<=n;i++) 
		fact=fact*i;
		long res=0;
	
	while(fact>0) {
		res+=fact%10;
		fact/=10;
		
	}
	if(res>100000000) 
		return-1;
		return(int)res;
	
}
public static void main(String[]args) {
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	int x=sol(n);
}
}
