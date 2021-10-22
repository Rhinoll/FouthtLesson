package com.company;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Lev", 181);
        Person p2 = new Person("Gennadiy", 170);
        p2.setName("L");

        Person [] people = {p1, p2};
        for (Person p: people) {
            System.out.println(p.getName() + " " + p.getName().length() +
                    " " + p.getHeightInCentimeter());
        }
        System.out.println("END");
    }
}
