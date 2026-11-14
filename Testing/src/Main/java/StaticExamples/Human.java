package StaticExamples;

public class Human {
    String name;
    int age;
    double salary;
    boolean maritalStatus;
//    long population;
    static long population;

    Human(String name, int age, double salary, boolean maritalStatus) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.maritalStatus = maritalStatus;

//        this.population += 1;//this will also work - but try to read more about static use cases - inside the this ( that refers to the current object is being created ) but we don't have any varibale called population inide the object so it will check on the human class? does this population exist in the class?
        Human.population += 1; // the population is a static method that doestn't depend on any instace variable so you can directly call it using the class name

    }

}
