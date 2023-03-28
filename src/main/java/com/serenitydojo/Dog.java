package com.serenitydojo;

public class Dog {
    private String name;
    private String favoriteToy;
    private int age;
    public static String DOG_NOISE="Woof";

    public String getName() {
        return name;
    }
    public String getFavoriteToy() {
        return favoriteToy;
    }
    public int getAge() {
        return age;
    }

    public Dog(String name, String favoriteToy, int age) {
        this.name=name;
        this.favoriteToy=favoriteToy;
        this.age=age;
    }
    public String makeNoise(){
        return Dog.DOG_NOISE;
    }

    public boolean feed(){
        return isFed();
    }

    public boolean isFed() {
        return true;
    }

}
