public class Pattern{
public static void main(String [] args){
for(int i=1;i<=4;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print("*");	//print  -  it prints on the same line
}
System.out.println( );	//println  -  go to next line
}
System.out.println( );
for(int i=1;i<=4;i++)
{
for(int j=i;j<=4;j++)
{
System.out.print("*");	//print  -  it prints on the same line
}
System.out.println( );	//println  -  go to next line
}

}}