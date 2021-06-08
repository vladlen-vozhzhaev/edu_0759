/*
*   Макс. возможное здоровье Person может быть 100ед.
*  */
public class Main {
    public static void main(String[] args) {
        int medKit = 50; // Аптечка
        Person zina = new Person("Zina","Petrova",60,null,null);
        Person ivan = new Person("Ivan","Ivanov",35,null,null);
        Person olga = new Person("Olga", "Ivanova", 35,zina,null);
        Person igor = new Person("Igor","Ivanov",14, olga, ivan);
        igor.getInfo();
    }
}

class Person{
    private String name;
    private String lastname;
    private int age;
    private int hp; // здоровье
    private Person mother;
    private Person father;

    public Person(String name, String lastname, int age, Person mother, Person father) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.hp = 100;
        this.father = father;
        this.mother = mother;
    }

    public void getInfo(){ // \n - символ переноса строки
        String info = "Привет, мня зовут "+this.name+"\n"+
                "Мне "+this.age+" лет\n";
        if (this.mother != null){ // Проверяем, что мама существует
            info += "Мою маму зовут "+this.mother.name+"\n" +
                    "Маме "+this.mother.age+" лет\n";
            if(this.mother.mother != null){ // Проверяем, что бабушка существует
                info += "Мою бабушку зовут "+this.mother.mother.name+"\n" +
                        "Бабушке "+this.mother.mother.age+" лет\n";
            }
        }
        if (this.father != null){ // Проверяем, что папа существует
            info += "Моего папу зовут "+this.father.name+"\n" +
                    "Моему папе "+this.father.age+" лет\n";
        }
        System.out.println(info);
    }

    public void sayHi(String name){
        System.out.println("Hello "+name+", my name is "+this.name);
    }
    public int getHp(){return this.hp;}
    public void setHp(int value){
        if (this.hp + value > 100) this.hp = 100;
        else this.hp = this.hp + value;
    }

    public String getLastname() {
        return lastname;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }

    public String getName() {
        return name;
    }
}
