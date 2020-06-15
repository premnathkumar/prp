import java.util.*;
public class Percantage{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String gender=sc.next();
int age=Integer.parseInt(args[0]);
if(gender.equals("Female") && age>=1 && age<=58)
{
 System.out.println("The percantage of interest is 8.2%");
}
else if(gender.equals("Female") && age>=59 && age<=100)
{
 
 System.out.println("The percantage of interest is 9.2%");
}
else if(gender.equals("male") && age>=1 && age<=58)
{
 System.out.println("The percantage of interest is 8.4%");
}
else if(gender.equals("male") && age>=59 && age<=100)
{
 System.out.println("The percantage of interest is 10.5%");
}
}
}