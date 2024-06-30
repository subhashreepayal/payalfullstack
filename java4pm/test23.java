class cot{
    int counter=0;
    cot(){
        counter ++;
    }
}
class test{
    public static void main(String[] args) {
        cot obj=new cot();
        cot obj1=new cot();
        System.out.println(obj.counter);
        System.out.println(obj1.counter);
    }
}