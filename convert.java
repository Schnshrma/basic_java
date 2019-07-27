import java.util.Scanner;
class convert
{
public static void main(String a[])
{
System.out.print("enter the temp in degree fahrenhiet");
Scanner s=new Scanner(System.in);
float f=s.nextFloat();
float c=(f-32)*(5f/9);
System.out.print("temp in degree centigrade is"+c);
}
}