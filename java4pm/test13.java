import java.util.Scanner;

class test13
{
   public static void main(String[] args)
   {
    int f=1;
    System.out.println("Enter the number ....");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
        f=f*i;
    }
    System.out.println(f);
   }
}
