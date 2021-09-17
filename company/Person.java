package com.company;
import java.util.Scanner;
public class Person implements HumanInterface {
    public static String  name;
    public static int age;
    public static int height;

    public Person(){}

    public static String getName(){
        return name;
    }

    public static boolean setName(String name){
        if(name == ""){
            return false;
        }
        return true;
    }

    public static int getHeight(){
        return height;
    }

    public static boolean setHeight(int height){
        if (height > 250 || height <= 45)
            return false;
        return true;
    }

    public static int getAge(){
        return age;
    }

    public static boolean setAge(int age){
        if (age > 160 || age <=0)
            return false;
        return true;
    }

    public static void setPerson() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        name = in.nextLine();
        System.out.println("Введите рост: ");
        height = in.nextInt();
        System.out.println("Введите возраст: ");
        age = in.nextInt();
        if (age <= 0) {
            System.out.println("Неправильный возраст");
        }
        else
        {
            System.out.println("Ваше имя: " + name);
            System.out.println("Ваш возраст: " + age);
            System.out.println("Ваш рост: " + height);
        }
    }

    @Override
    public String think() {
        return null;
    }

    @Override
    public String getName(int n) {
        return null;
    }

    public enum Gender {
        Male(1, "Мужчина"),
        Female(2, "Женщина"),
        Helicopter(8, "Вертолетик");

        private int value;
        private String strvalue;

        private Gender(int value, String strvalue) {
            this.value = value;
            this.strvalue = strvalue;
        }
        int getValue() {
            return value;
        }

        String getStrvalue() {
            return strvalue;
        }
    }
}