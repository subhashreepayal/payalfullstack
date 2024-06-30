class test9
{
    public static void main(String[] args)
     {
     int a=5;
     int b=6;
     System.out.println("Before two number a is "+a+",b is "+b);
     a=a^b;
     b=b^a;
     a=a^b;
     System.out.println("After swap two number a is "+a+",b is "+b);
    }
}

