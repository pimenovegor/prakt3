package com.bsbo_07_19.pimenov.task1;


public class Feline {
    public void voice() {
        System.out.println("Im from cat family");
    }
    public static class Lion extends Feline {
        public void who(){
            System.out.println("Im a lion");
        }
    }
    public class Tyge extends Feline {
        public void who(){
            System.out.println("Im a tyge");
        }
    }
    public class Cheetah{
        public void who(){
            System.out.println("Im a cheetah");
        }
    }
}
