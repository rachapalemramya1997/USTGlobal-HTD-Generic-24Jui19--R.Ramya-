public class MethodExamples{
public static int calcArea(int side){
int area = side*side;
return area;
}
public static int area(int l,int b){
int area=l*b;
return area;
}
public static float avg(int a,int b,int c){	//average
float avg=(a+b+c)/3;
return avg;
}
public static void main(String [] args)
{
int c=calcArea(5);
System.out.println("Area of square:  "+c);
int r=area(6,7);
System.out.println("Area of Rectangle:  "+r);
float p=avg(6,7,8);
System.out.println("Avg of 3nums:  "+p);
}}
