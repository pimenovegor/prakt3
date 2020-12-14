package com.company;
import java.util.Scanner;
import com.bsbo_07_19.pimenov.task1.Feline;
import com.bsbo_07_19.pimenov.task2.Cat;
import java.util.HashSet;
import com.bsbo_07_19.pimenov.task3.Cat.*;
import com.bsbo_07_19.pimenov.task4.Cat.*;
public class Main {
    static Scanner in=new Scanner(System.in);
    static int a;
    static Feline cat=new Feline();
    static Feline.Lion lion=new Feline.Lion();
    static Cat grandpa=new Cat("Алесандр");
    static Cat grandma=new Cat("Татьяна");
    static Cat mom=new Cat("Лена");
    static Cat pop=new Cat("Олег");
    static Cat daughter=new Cat("Диана");
    static Cat son=new Cat("Артем");
    static com.bsbo_07_19.pimenov.task3.Cat cat1=new com.bsbo_07_19.pimenov.task3.Cat("cat1");
    static com.bsbo_07_19.pimenov.task3.Cat cat2=new com.bsbo_07_19.pimenov.task3.Cat("cat2");
    static com.bsbo_07_19.pimenov.task3.Cat cat3=new com.bsbo_07_19.pimenov.task3.Cat("cat3");
    static com.bsbo_07_19.pimenov.task3.Cat cat4=new com.bsbo_07_19.pimenov.task3.Cat("cat4");
    static com.bsbo_07_19.pimenov.task3.Cat cat5=new com.bsbo_07_19.pimenov.task3.Cat("cat5");
    static com.bsbo_07_19.pimenov.task3.Cat cat6=new com.bsbo_07_19.pimenov.task3.Cat("cat6");
    static com.bsbo_07_19.pimenov.task3.Cat cat7=new com.bsbo_07_19.pimenov.task3.Cat("cat7");
    static com.bsbo_07_19.pimenov.task3.Cat cat8=new com.bsbo_07_19.pimenov.task3.Cat("cat8");
    static com.bsbo_07_19.pimenov.task3.Cat cat9=new com.bsbo_07_19.pimenov.task3.Cat("cat9");
    static com.bsbo_07_19.pimenov.task3.Cat cat10=new com.bsbo_07_19.pimenov.task3.Cat("cat10");
    static com.bsbo_07_19.pimenov.task4.Cat setCat=new com.bsbo_07_19.pimenov.task4.Cat();
    static HashSet <com.bsbo_07_19.pimenov.task4.Cat> cats;
    public static void main(String[] args){
        System.out.println("Задание 1");
        System.out.println("Задание 2");
        System.out.println("Задание 3");
        System.out.println("Задание 4");
        a=in.nextInt();
        switch (a) {
            case 1:
            System.out.println("ОбЪект:");
            cat.voice();
            System.out.println("Наследник:");
            lion.who();
            break;
            case 2:
mom.full(grandma,grandpa);
daughter.full(mom,pop);
mom.print();
daughter.print();
                break;
            case 3:
                    com.bsbo_07_19.pimenov.task3.Cat.printCats();
                break;
            case 4:
                cats= setCat.createCats();
                setCat.printCats(cats);
                System.out.println("Какую кошку из SET вы хотите удалить?");
                int i=in.nextInt();
                switch(i){
                    case 1:
                        cats.remove(cats.toArray()[0]);
                        break;
                    case 2:
                        cats.remove(cats.toArray()[1]);
                        break;
                    case 3:
                        cats.remove(cats.toArray()[2]);
                        break;
                }
                setCat.printCats(cats);
        }
    }
}

