public class LogicalOperators{
public static void main(String [] args){
boolean b=true;
boolean c=false;
boolean d = b&&c;
System.out.println(" For && : "+d);	//logical AND operator
d = b||c;
System.out.println(" For || : "+d);	//logical OR operator
d =!( b||c);
System.out.println(" For ! : "+d);	//logical NOT operator
}}