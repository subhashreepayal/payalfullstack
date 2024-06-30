class test
{
    public static void main(String[] args) 
        {    
            float f=20.5f;
            int i=Float.floatToIntBits(f);
            String bin =Integer.toBinaryString(i);
            System.out.println(bin);
        }
    
}