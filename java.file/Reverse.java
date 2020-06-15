import java.util.*;
public class Reverse{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int Temp,rev=0;
while(num>0)
{
Temp=num%10;
rev=rev*10+Temp;
num=num/10;
}
System.out.println(rev);
}
}
