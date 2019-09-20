public class Operators{
public static void main(String [] args){
byte i=50;
byte j=20;
int c=i*j;
System.out.println("For * : "+c);
c+=j;
System.out.println("For +=  : "+c);
c++;
System.out.println("For c++ : "+c);
c=++i+j++;
System.out.println("For  c=++i+j++ : "+c);
c=--j;
System.out.println("For  --j :  "+c);
boolean d=i==j;
System.out.println("For == : "+d);
boolean e=i>=j;
System.out.println("For >= :"+e);
boolean p=d&&e;
System.out.println("For && : "+p);
boolean q=d||e;
System.out.println("For || : "+q);
boolean r=!(d||e);
System.out.println("For ! : "+r);
int k=i&j;
System.out.println("For & : "+k);
int l=i|j;
System.out.println("For | : "+l);
int m=i^j;
System.out.println("For ^ : "+m);
}}