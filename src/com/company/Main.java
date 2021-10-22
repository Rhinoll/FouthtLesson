package com.company;
public class Main {
    public static void main(String[] args) {
        String s = "545";
        int [] i = new int[56];
        Person e = new Person();
        System.out.println(e.some);
        e.some += 78;
        System.out.println(e.some);
        Person e2 = e;
        System.out.println(e2.some);
        change(e2);
        System.out.println(e2.some);
        System.out.println(new Person().some);
    }
    private static void change(Person ex){
        ex.some /= 2;
    }
}
