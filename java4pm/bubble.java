public class bubble {


public static void main(String[] args) {
    int[]arr= new int[]{25,17,31,13,2};
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<=arr.length-i-1;j++){
            if( arr[j]>arr[j+1]){
                int t=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=t;
            }
        }
    }

for (int i:arr){
    System.out.println(i);
}
}
}