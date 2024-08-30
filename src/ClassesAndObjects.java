public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "John";
        person1.age = 30;

        Person person2 = new Person();
        person2.name = "Alice";
        person2.age = 25;

        System.out.println("Person 1: Name - " + person1.name + ", Age - " + person1.age);
        System.out.println("Person 2: Name - " + person2.name + ", Age - " + person2.age);
    }
}
class Person {
    //У класса может быть:
    //1. Данны(поля)
    //2. Действия, которые он может совершать(методы)
    String name;
    int age;
}