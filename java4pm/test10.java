import java.util.Scanner;
public class test10 
{
    public static void main(String[]arg)
    {
        
        System.out.println("enter the score of ind,pak,aus");
        Scanner sc=new Scanner(System.in);
        int ind=sc.nextInt();
        int pak=sc.nextInt();
        int aus=sc.nextInt();
        if (ind>pak)
        {
        if (ind>aus)
            {
            System.err.println("score of india is high");
            }
            else
            {
            System.out.println("score of aus is high");
            }
        }
else if(pak>aus)
{
    System.out.println("score if pak is high");
}
else
{
    System.out.println("score of aus is high");
}
}
}
