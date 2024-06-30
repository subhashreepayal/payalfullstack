class employee{
    int add(int i,int j){
        int r=i+j;
        return r;
    }
public static void main(String[] args) {
    employee obj= new employee();
    int result=obj.add(20,30);
    System.out.println(result);
}
}