class A{
    int i=100;
}
class B extends A
{
     int j=200;
public static void main(String[] args) {
   
    B obj =new B();
    System.out.println(obj.i);
    System.out.println(obj.j);

}
}