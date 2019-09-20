public class SwitchCase{
public static void main(String [] args){
int  daynum=2;           //By using scanner also we can give any numbers
switch(daynum){
case 1:
case 2:
case 3:
case 4:
case 5:
System.out.println("WeekDays");
break;
default :			//we change default statement anywhere in the program
System.out.println("Invalid Day num");
break;   //when default is at last position no need to give break statement.Otherwise break statement is compulsory(it displays all possible statements ). 
case 6:
case 7:
System.out.println("Weekends");
break;
}
System.out.println("Outside Switch block");
}}










