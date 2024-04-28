package com.msb.test01;

public class person {
    private String name;
    private int age;
    private double height;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void study(){
        System.out.println("learn!\n");
    }
    public static void main(String[] args) {
        System.out.println("i love java");
        System.out.println();
    }
    public  person(int age){
        this.age = age;
        System.out.println("initialized\n");
    }
    public  person(){
        System.out.println("initialized\n");
    }
}
