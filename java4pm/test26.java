class test{
    static String compname;
    static{
        compname="seeree";
    System.out.println("static block 1st");
}
public static void main(String[] args) {
    System.out.println("main "+compname);
}
}

