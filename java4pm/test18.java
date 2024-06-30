class test
{
    public static void main(String[] args) {
        int []arr=new int[]{10,20,30,40,45,46,47};
        int search=45;
        int flag=0;
        for (int i:arr){
            if(i==search){
              flag=1;
              break;
            }
            System.out.println("search ......"+i);
        }
            if (flag==1)
        
        System.out.println("searching Succesful"+Search);
    
    else{
    System.out.println("not found");
    }
    }
}

