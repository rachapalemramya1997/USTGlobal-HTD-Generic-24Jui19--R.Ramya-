public class AssignmentOperator{
public static void main(String [] args){
int i;
int j;
i=10;
j=20;
System.out.println("For '=' i = "+i);
System.out.println("For '=' j = "+j);
j +=i;				//compound addition operation    j=j+i
System.out.println("For '+=' i = "+j);
j-=i;				//compound subtraction operation    j=j-i
System.out.println("For '-=' i = "+j);
j*=i;				//compound multiplication operation   j=j*i
System.out.println("For '*=' i = "+j);
j/=i;				//compound division operation     j=j/i
System.out.println("For '/=' i = "+j);
j%=i;				//compound modulous operation      j=j%i
System.out.println("For '%=' i = "+j);
}}