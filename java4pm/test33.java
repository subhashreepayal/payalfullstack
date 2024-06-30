class cat{
    void says(){
        System.out.println("meow....");
    }
}
class dog{
    void says(){
        System.out.println("hua...");
    }
}
    class test{
    public static void main(String[] args) {
        cat cobj=new cat();
        cobj.says();
        dog dobj=new dog();
        dobj.says();

    }
}
