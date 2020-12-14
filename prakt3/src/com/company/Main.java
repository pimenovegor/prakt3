package com.company;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
static Scanner in=new Scanner(System.in);
static First first=new First();
static Second second=new Second();
static Third third=new Third();
static Fourth fourth=new Fourth();
static Fifth fifth=new Fifth();
static Sixth sixth=new Sixth();
static Seventh seventh=new Seventh();
static Eighth eighth=new Eighth();
    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println("Задание 2");
        System.out.println("Задание 3");
        System.out.println("Задание 4");
        System.out.println("Задание 5");
        System.out.println("Задание 6");
        System.out.println("Задание 7");
        System.out.println("Задание 8");
        int a=in.nextInt();
        switch (a){
            case(1):
                first.go();
                break;
            case(2):
                second.go();
                break;
            case(3):
                third.go();
                break;
            case(4):
                fourth.go();
                break;
            case(5):
                fifth.go();
                break;
            case(6):
                sixth.go();
                break;
            case(7):
                seventh.go();
                break;
            case(8):
                eighth.go();
                break;
        }
    }
}
class First{
   String firstname="Иван";
   String secondname="Иванов";
   String midllename="Иванович";
   public void go(){
       String line=firstname+secondname+midllename;
       System.out.println(line);
   }
}
class Second{
    String name="Петя";
    int age =27;
    public void go(){
        String line="Меня зовут "+name.toLowerCase()+", мне "+age+" лет";
        System.out.println(line);
    }
}
class Third{
    Scanner in=new Scanner(System.in);
    public void go(){
        System.out.println("Введите строку");
        String line=in.nextLine();
        char [] sign=new char[line.length()];
        line.getChars(0,line.length(),sign,0);
        for(char s:sign){
            System.out.println(s);
        }
    }
}
class Fourth{
    String line;
    Scanner in=new Scanner(System.in);
    public void go(){
        System.out.println("Введите строку");
        line=in.nextLine();
        System.out.println("Какую подстроку или символ вы хотите заменить");
        String oldSub=in.nextLine();
        System.out.println("На какую подстроку или символ вы хотите заменить");
        String newSub=in.nextLine();
        line=line.replace(oldSub,newSub);
        System.out.println("Новая строка: "+line);
    }
}
class Fifth{
    Scanner in=new Scanner(System.in);
    public void go(){
        System.out.println("Введите строку");
        String line=in.nextLine();
        System.out.println("Изменить регистр отдельного символа(1) или всей строки(2) или сравнить строки(3)  (1 or 2 or 3)");
        int i=in.nextInt();
        switch (i){
            case 1:
        char [] sign=new char[line.length()];
        line.getChars(0,line.length(),sign,0);
        System.out.println("Какой символ вы хотите изменить");
        char olds=in.next(".").charAt(0);
        line="";
        for(char s:sign) {
            int a=0;
            if(olds==Character.toLowerCase(s)){
                s=Character.toUpperCase(s);
                a++;
            }
            if(olds==Character.toUpperCase(s)&&a==0){
                s=Character.toLowerCase(s);
            }
            line+=s;
        }
        System.out.println(line);
        break;
            case 2:
                int a=0;
                if(line==line.toUpperCase()){
                  line=line.toLowerCase();
                  a++;
                }
                if(line==line.toLowerCase()&&a==0) {
                    line = line.toUpperCase();
                }
                System.out.println(line);
            case 3:
                System.out.println("Введите вторую строку");
                String line2=in.nextLine();
                if (line==line2){
                    System.out.println("Строки идентичные");
                }
                else System.out.println("Строки отличаются");
                break;
        }
    }
}
class Sixth{
    String line;
    Scanner in=new Scanner(System.in);
    public void go(){
        System.out.println("Введите строку");
        line=in.nextLine();
        char[] remove=new char[line.length()];
        line.getChars(0,line.length(),remove,0);
        line="";
        for(int i=remove.length-1;i>=0;i--){
           line+=remove[i];
        }
        System.out.println(line);
    }
}
class Seventh {
    ArrayList<Integer> numbers=new ArrayList<Integer>();
    Scanner in = new Scanner(System.in);
    public void go() {
        System.out.println("Введите цифру");
        try {
            while (true) {
                numbers.add(in.nextInt());
            }
        } catch (InputMismatchException e) {
            for (int n : numbers) {
                System.out.println(n);
            }
        }
    }
}
class Eighth{
    String s = null;
    public void go() {
        System.out.println("Пункт a");
        try {
            String m = s.toLowerCase();
        }
        catch (NullPointerException nu){
            System.out.println(nu);
        }
        System.out.println("Пункт b");
        int[] m = new int[2];
        try {
            m[8] = 5;
        }
        catch (IndexOutOfBoundsException in){
            System.out.println(in);
        }
        System.out.println("Пункт c");
        ArrayList<String> list = new ArrayList<String>();
        try {
            String s = list.get(18);
        }
        catch (IndexOutOfBoundsException cl){
            System.out.println(cl);
        }
    }
}
