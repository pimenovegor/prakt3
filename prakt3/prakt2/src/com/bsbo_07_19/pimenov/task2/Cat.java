package com.bsbo_07_19.pimenov.task2;
import com.bsbo_07_19.pimenov.task1.Feline;

public class Cat extends Feline {
    String name;
    Cat mom;
    Cat pop;
    public Cat(String name){
        this.name = name;
    }

    public void full(Cat mom, Cat pop) {
        this.mom = mom;
        this.pop = pop;
    }

    public void print() {
        System.out.println("Кошка " + name);
        System.out.println("");
        System.out.println("Родители кошки "+name);
        System.out.println("");
        if (mom == null && pop == null) {
            System.out.println("мама неизвестна");
            System.out.println("папа неизвестен");
            System.out.println("");
        } else {
            System.out.println("Мама");
            mom.print();
            System.out.println("");
            System.out.println("Папа");
            pop.print();
            System.out.println("");
        }
    }
}
