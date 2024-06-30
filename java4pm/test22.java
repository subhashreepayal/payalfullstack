class Employee{
    int eid;
    String ename;
    static String comp = "seeree";
    Employee(int i,String n)
    {
        eid=i;
        ename=n;
    }
}
class test{
    public static void main(String[] args) {
        Employee e1= new Employee(100,"raja");
        Employee e2= new Employee(200,"aja");
        System.out.println("company name:"+Employee.comp);
        System.out.println("id: "+e1.eid+" name :"+e1.ename);
        System.out.println("id: "+e2.eid+" name :"+e2.ename);
        
        
    }
}