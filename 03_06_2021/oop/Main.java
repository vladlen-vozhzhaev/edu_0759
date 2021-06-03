public class Main {
    public static void main(String[] args) {
        Person user1 = new Person("Ivan","Ivanov",35);
        Person user2 = new Person("Igor","Sidorov",40);
        user1.name = "Oleg";
        user1.sayHi("Oleg");
        user2.sayHi("Vasya");
    }
}

class Person{
    String name;
    String lastname;
    int age;

    public Person(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public void sayHi(String name){
        System.out.println("Hello "+name+", my name is "+this.name);
    }
}
