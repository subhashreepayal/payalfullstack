class pclass{
    int i=100;
}
class test extends pclass{
    int i=200;
    test()
    {
        System.out.println(this.i);
        System.out.println(super.i);
    }

public static void main(String[]arg){
    pclass pobj=new test();
    System.out.println(pobj.i);
}
}
