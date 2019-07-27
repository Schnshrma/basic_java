import java.util.Scanner;
class currency
{
public static void main(String ar[])
{
System.out.print("enter the amount in multiples of 10");
Scanner d=new Scanner(System.in);
int a=d.nextInt();
int p=a%100;
int q=a-p;
q=q/100;
System.out.println("one hundred notes="+q);
int r=p%50;
q=p-r;
q=q/50;
System.out.println("fifty rupee notes:"+q);
r=r/10;
System.out.println("ten rupee notes:"+r);
}
}

