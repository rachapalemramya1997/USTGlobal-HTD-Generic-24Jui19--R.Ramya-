import java.util.Scanner;
public class If_Elseifstatement{
public static void main(String [] args){
Scanner scn=new Scanner(System.in);
System.out.println("enter marks");
int marks=scn.nextInt();
if(marks<=100 && marks>=91)
{
System.out.println("A");
}
else if(marks<=90 && marks>=81){
System.out.println("B");
}
else if(marks<=80 && marks>=71){
System.out.println("c");
}
else if(marks<=70 && marks>=61){
System.out.println("D");
}
else if(marks<=60 && marks>=51){
System.out.println("E");
}
else if(marks<=50 && marks>=41){
System.out.println("Retest");
}
else if(marks<=40){
System.out.println("Fail");
}
else {
System.out.println("other than score");
}
}}