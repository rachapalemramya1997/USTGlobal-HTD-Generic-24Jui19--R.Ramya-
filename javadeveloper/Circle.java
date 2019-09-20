public class Circle{
public static float calcArea(int radius){ 
float b=3.14f; 
float area=b*radius*radius;
return area;
}
public static void main(String [] args)
{
float c=calcArea(12);
System.out.println("Area of Circle:  "+c);
}}
