import java.util.Scanner;
class input{
public static void main(String ar[])
{
int x,a,b,c,e;
Scanner input=new Scanner(System.in);
System.out.print("Enter a 3-digit integer");
x = input. nextInt();
a=x%10;
e=x/10;
b=e%10;
c=x/100;
x=(a*100)+(b*10)+c;
System.out.print(x);


}
}

