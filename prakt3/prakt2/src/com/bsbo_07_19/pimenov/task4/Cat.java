package com.bsbo_07_19.pimenov.task4;

import java.util.HashSet;

public class Cat {
    String name;
    static int num=0;
    public HashSet<Cat> createCats(){
        HashSet<Cat> cats =new HashSet<Cat>();
        Cat cat1=new Cat();
        cat1.setName();
        Cat cat2=new Cat();
        cat2.setName();
        Cat cat3=new Cat();
        cat3.setName();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        return cats;
          }
    public void printCats(HashSet<Cat> cats){
        for (Cat cat:cats) {
            System.out.println(cat.name);
        }
    }
    public void setName(){
        num++;
    this.name="Cat"+num;
    }
}

