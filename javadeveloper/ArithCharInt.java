public class ArithCharInt{
public static void main(String []args){
int i=10;
char j='B';
int  res=i+j;			//reinitialize variable res many times.
System.out.println("+ Result = "+res);	//addition
res=i-j;
System.out.println("+ Result = "+res);	//subtraction
res=i*j;
System.out.println("+ Result = "+res);	//multiplication
res=i/j;
System.out.println("+ Result = "+res);	//division
res=i%j;
System.out.println("+ Result = "+res);	//modulo division
}}		//char stores 2bytes.int stores 4bytes.It displays output in bigger data type.