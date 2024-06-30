abstract class Agenda  {
    abstract void task1();
    
}
 class meeting extends Agenda{
    void task1(){
        System.out.println("TAsk done....");
    }
    public static void main(String[] args) {
      meeting obj=new meeting();  
      obj.task1();
    }
 }