
import java.util.*;

public class collatz {
public static void main(String[]args) {
	int max=0;
	int min=0;
	int result=0;
	List<Integer>num_array=new ArrayList<Integer>();
	for(int i=2;i< 100000;i++) {
		int num=i;
		num_array.clear();
		while(num !=1) {
			if(num%2==0) {
				num=num/2;
				}
			else {
				num=3*num+1;
				
			}
			num_array.add(num);
		}
		int len=num_array.size();
		if(len>max) {
			max=len;
			result=i;
		}
	}
	System.out.printf("%d %d", result, max);
	
}
}
