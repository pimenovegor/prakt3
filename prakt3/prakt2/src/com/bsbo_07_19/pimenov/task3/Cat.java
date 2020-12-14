package com.bsbo_07_19.pimenov.task3;

public class Cat {
    String name;
    static Cat [] cats=new Cat[10];
    public Cat(String name){
        this.name=name;
        fullCats(this);
    }
    public static void fullCats(Cat cat){
        for(int i=0;i<10;i++){
            if(cats[i]==null){
                cats[i]=cat;
                break;
            }
        }
    }
    public static void printCats(){
        for(int i=0;i<10;i++){
            if(cats[i]!=null) {
                System.out.println(i + 1 + " кошка по имени " + cats[i].name);
            }
        }
    }
}
