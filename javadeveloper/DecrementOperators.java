public class DecrementOperators{
public static void main(String [] args){
int i = 10;
int j = i--;     //substitute i=10  j=10
System.out.println(j);   //utilize j=10
j = i--;    //decrement i=9
System.out.println(j);  //j=9
j = --i;    //decrement i=8  and predecremented by 7      
System.out.println(j);            //j=7
}}