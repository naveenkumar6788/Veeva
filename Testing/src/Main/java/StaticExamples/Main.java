package StaticExamples;

import packages.a.Greeting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Human chandan = new Human("Chandan", 21, 11.0f, false);
        Human rabi = new Human("Rabi", 19, 15.2f, false);
        System.out.println(chandan.name);

        System.out.println(chandan.population);
//        System.out.println(rabi.population);
        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);

//        Greeting(); //you will get error ? explore it
        Main fun = new Main();
//        fun.greeting();
        fun.funn();
    }

// this doesn't depend on objects
    static void Greeting() {
//        greeting();// you can't use it because it requires an instace
    //  but the function we are using is doesn't depend on instace
        System.out.println("Good morning");
    }
    void funn() {
        greeting();
    }

// we know that something that doesn't belong to static , is belongs to objects
    void greeting() {
        System.out.println("Namamskaram");
    }
}
