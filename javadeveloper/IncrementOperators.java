public class IncrementOperators{
public static void main(String [] args){
int i = 10;
int j = i++;     //substitute i=10
System.out.println(j);   //utilize j=10
j = i++;    //increment i=11
System.out.println(j);  //j=11
j = ++i;    //increment i=12  and preincremented by 13      
System.out.println(j);            //j=13
}}