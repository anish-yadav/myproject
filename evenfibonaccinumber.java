import java.util.*;
public class evenfibonaccinumber {
public static void main(String[]args) {
int number1=1;
int number2=2;

Scanner sc=new Scanner(System.in);
System.out.println("Enter the number for ending of the fibonacci series::");
int endofnumber=sc.nextInt();
   System.out.print(number1+",");
   System.out.print(number2+",");
   for(int i=0;i<endofnumber;i++)
   {
	   int afterthenumber=number1+number2;
	      number1=number2;
	   number2=afterthenumber;
	   System.out.print(afterthenumber+",");
   }
   System.out.print(".....");
}
}
