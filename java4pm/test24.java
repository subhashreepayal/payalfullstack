class counter{
    static int count=0;
    counter(){
    count++;
    System.out.println(count);
    }

public static void main(String[] args)
{
    counter e1=new counter();
    counter e2=new counter();

}
}
