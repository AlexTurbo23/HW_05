package classes;


public class Cat6 {
    String name;
    int weight;
    int age;
    String color;
    String address;

    public Cat6(String name) {
        this.name = name;
        this.weight = 1+(int)(Math.random() * 9);
        this.age = 1 + (int)(Math.random() * 15);
    }

    public Cat6(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cat6(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 1+(int)(Math.random() * 9);
    }

    public Cat6(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 1 + (int)(Math.random() * 15);
    }

    public Cat6(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 1 + (int)(Math.random() * 15);
    }
   /* public static void main(String[] args) {
        Cat6 markis = new Cat6("markiz");
        System.out.println(markis.age);
        System.out.println(markis.weight);
    }*/
}

    /*
    Create 5 constructors
    1. Name
    2. Name, weight, age
    3. Name, age. (weight should be standard)
    4. weight, color. (name, address and age are unknown. Cat is homeless)
    5. weight, color, address

    Each constructor should create the valid object.
    For example, if we don't know weight, we should specify some kind of standard weight.
    Because cat cannot weight anything
    The same with age
    But it cannot have name(null) and address(null)
     */

