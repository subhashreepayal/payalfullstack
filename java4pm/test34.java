class calc{
    int add(int i,int j){
    return i+j;
}
float add(float i,float j){
return i+j;
}}

class test {
    public static void main(String[] args) {
        calc obj =new calc();
        System.out.println(obj.add(100,200));
        System.out.println(obj.add(10.5f,5.3f));
    }
}

