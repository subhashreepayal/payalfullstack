class test
{
    public static void main(String[] args) {
        int k=2;
        int i=0;
        int end=200;
        int sq=0;
        while (sq<end) {
            sq=(int)Math.pow(k,i);
            i++;
            System.out.println(sq);
        }
    }
}
