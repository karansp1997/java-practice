import java.util.Scanner;
class Add
{
	int c;
	void addition(int x,int y)
	{
	 c=x+y;
	}
public static void main(String[] arg)
{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number");
a=sc.nextInt();
System.out.println("Enter second number");
b=sc.nextInt();
Add r=new Add();
r.addition(a,b);
System.out.println("Addition of two numbers is : "+r.c);
}
}