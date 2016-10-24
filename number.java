import java.io.*;
class number
{
public static void main(String[] args)
{
try
{
int n,rem=0;
int count=0;
DataInputStream in=new DataInputStream(System.in);
System.out.print("Enter the nunmber");
n=Integer.parseInt(in.readLine());
while(n!=0)
{
rem=n%10;
count++;
n=n/10;
}
System.out.println("The number of digits in a number is:"+count);
}
catch(Exception e)
{
}
}
}
