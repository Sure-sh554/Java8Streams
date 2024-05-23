package MethodReference;

import java.util.Comparator;

public class MethodReferenceExample {
    //Syntax for the method reference
    //className::methodName
    public static void main(String[] args) {
        //Old Way
        System.out.println(MethodReferenceExample.compare(10,20));
        Comparator<Integer> com=MethodReferenceExample::compare;
        System.out.println(com.compare(20,10));


    }

    public static int compare(Integer x,Integer y){
        return Integer.compare(x,y);
    }
}
