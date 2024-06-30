class student{
    int roll;
    student(int roll)
    {
        this.roll=roll;
    }
    student(student s1){
        this.roll=s1.roll;
    }
}
class test{
    public static void main(String[] args) {
        student s1=new student(20);
        student s2=new student(s1);
        System.out.println(s1.roll);
        System.out.println(s2.roll);
    }
}