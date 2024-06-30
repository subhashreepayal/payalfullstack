import java.util.Scanner;
class test
{
    public static void main(String[] args)
    
    {
    Scanner sc=new  Scanner (System.in);
    System.out.println("Pls enter a number 0-10");
    int num=sc.nextInt();
    while(!(num>=0&&num<=10))
    {
    System.out.println("Plz enter a number 0-10");
    num=sc.nextInt();
    }
    System.out.println("Thanks ...");
    }
}