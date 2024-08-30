public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "John";
        person1.age = 30;
    //    person1.speak();
        int year1 = person1.CalculateYearsToRetirement();
        System.out.println("Вам " + year1 + " лет до пенсии");


        Person person2 = new Person();
        person2.name = "Alice";
        person2.age = 25;
    //    person2.speak();
    //    person2.sayHello();
    //    System.out.println("Person 1: Name - " + person1.name + ", Age - " + person1.age);
    //    System.out.println("Person 2: Name - " + person2.name + ", Age - " + person2.age);
        int year2 = person2.CalculateYearsToRetirement();
        System.out.println("Вам " + year2 + " лет до пенсии");
    }
}
class Person {
    //У класса может быть:
    //1. Данны(поля)
    //2. Действия, которые он может совершать(методы)
    String name;
    int age;


    int CalculateYearsToRetirement(){
        int years = 65-age;
        return years;
    }

    void speak(){
        for(int i = 0; i < 3; i++){
        System.out.println("Меня зовут " + name +", мне "+age+" лет");}
    }
    void sayHello(){
        System.out.println("Привет, меня зовут " + name);
    }
}