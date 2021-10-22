package com.company;

public class Person {

    private String name;
    private int heightInCentimeter;

    public Person(String name) {
        if (name == null || name.length() == 0) {
            name = "DEFAULT_NAME";
        }
        this.name = name;
    }

    public Person(String name, int heightInCentimeter) {
        this(name);
        if (heightInCentimeter < 0) {
            heightInCentimeter = 0;
        }
        this.heightInCentimeter = heightInCentimeter;
    }

    public void growUP(int heightInCentimeter) {
        if (heightInCentimeter < 0) {
            heightInCentimeter = 0;
        }
        this.heightInCentimeter += heightInCentimeter;
    }

    public int getHeightInCentimeter() {
        return heightInCentimeter;
    }

    public void setName(String name) {
        if (name == null || name.length() == 0) {
            return;
        }
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
