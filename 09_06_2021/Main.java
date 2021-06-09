import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Барсик",4, "Дворняга");
        Bird kesha  = new Bird("Кеша",5,"Волнистый");
        barsik.run();
        kesha.fly();
    }
}

interface canJump{
    public void jump();
}

class Animal{
    private String nickName;
    private int age;
    private String breed;

    public Animal(String nickName, int age, String breed) {
        this.nickName = nickName;
        this.age = age;
        this.breed = breed;
    }

    public String getNickName() { return nickName; }
    public void setNickName(String nickName) { this.nickName = nickName; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }
    public void eat(){
        System.out.println("Ням ням");
    }
}


class Cat extends Animal implements canJump{
    public Cat(String nickName, int age, String breed) {
        super(nickName, age, breed);
    }
    public void run(){
        System.out.println(this.getNickName()+" бежит куда-то");
    }


    @Override
    public void jump() {
        System.out.println("Прыг");
    }

}

class Snake extends Animal{
    public Snake(String nickName, int age, String breed) {
        super(nickName, age, breed);
    }
}

class Bird extends Animal implements canJump{
    public Bird(String nickName, int age, String breed) {
        super(nickName, age, breed);
    }
    public void fly(){
        System.out.println(this.getNickName()+" летит куда-то");
    }
    public void run(){
        System.out.println(this.getNickName()+" бежит куда-то");
    }
    @Override
    public void jump() {
        System.out.println("Прыг");
    }

}
