import java.util.*;
public class LastDigit{
 public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  int num=sc.nextInt();
  int r=num%10;
  if(r==7)
{
 System.out.println("True");
}
else
{
System.out.println("False");
}
}
}

