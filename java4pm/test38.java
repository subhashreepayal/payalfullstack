class student{
    private int age=20;
    void show(){
        System.out.println(this.age);
    }
}
public class test38{
    public static void main(String[] args) {
        student obj=new student();
        obj.show();
    }
}