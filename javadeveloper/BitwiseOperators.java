public class BitwiseOperators{
public static void main(String [] args){
boolean b=true;
boolean c=false;
boolean d = b&c;
System.out.println(" For & : "+d);	//Bitwise AND operator
d = b|c;
System.out.println(" For | : "+d);	//Bitwise OR operator
d =!( b|c);
System.out.println(" For ! : "+d);	//logical  NOT operator
System.out.println("****************");
byte p=2;
byte q=3;
int r = p&q;
System.out.println(" For & : "+r);
r = p|q;
System.out.println(" For | : "+r);
r= p^q;
System.out.println("For ^ : "+r);
}}