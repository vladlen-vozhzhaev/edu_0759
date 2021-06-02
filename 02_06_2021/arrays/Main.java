import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // найти максимальный не четный эл. массива
        int[] nums = {-433,-235,-345,-2,-23,-122,-33};
        int max = (int) (-1.0 / 0.0);
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i] && nums[i]%2!=0) max = nums[i];
        }
        System.out.println(max);
        /*int[] nums = {5,5,5,4,3,4,4,5,5};
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        System.out.format("%-10.1f%n", sum / nums.length);*/

        /*String[] cars = {"audi","bmw","kia"};
        System.out.println(cars.length); // кол-во эллементов массива
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toUpperCase());
        }*/


        /*Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Введите команду: ");
            String str = scanner.nextLine();
            if(str.equals("exit")){
                break;
            }else if (str.equals("next")){
                continue;
            }
            System.out.println("Выполнение цикла while");
        }*/

        /*for (int i = 0; i < 3; i++) {
            System.out.println("Значение переменной i="+i);
        }*/


        /*int i = 3;
        while (i<3){
            System.out.println("Цикл while");
        }

        do{
            System.out.println("Цикл do while");
        }while(i<3);*/


        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Введите логин: ");
        String login = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String pass  = scanner.nextLine();
        while (!(login.equals("admin") && pass.equals("123"))){
            System.out.println("Доступ запрещен");
            System.out.print("Введите логин: ");
            login = scanner.nextLine();
            System.out.print("Введите пароль: ");
            pass  = scanner.nextLine();
        }
        System.out.println("Доступ разрешен для Admin");*/
    }
}
