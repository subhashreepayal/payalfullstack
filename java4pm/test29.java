class student{
    int roll;
    student(int roll)
    {
        this.roll=roll;
    }
}
class test{
    public static void main(String[] args) {
        student s1=new student(20);
        
        System.out.println(s1.roll);
        
    }
}