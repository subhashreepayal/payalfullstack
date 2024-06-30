package com.seeree;
public class calc
{
    public int  Add(int i,int j){
        return i+j;
    }
}
public class test{
    public static void main(String[] args) {
        com.seeree.calc obj=new com.seeree.calc();
        int r=obj.Add(10,20);
        System.out.println(r);
    }
}

