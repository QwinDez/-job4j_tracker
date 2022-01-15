package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public String sound() {
        return "may-may";
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println("Name cat : " + this.name + ". " + "There are food: " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();
        String say = peppy.sound();
        System.out.println("Peppy says " + say);
        Cat gav = new Cat();
        gav.giveNick("Gav");
        gav.eat("kotleta");
        gav.show();
        Cat black = new Cat();
        black.giveNick("Black");
        black.eat("fish");
        black.show();
    }
}
