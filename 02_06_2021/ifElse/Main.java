import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите логин: ");
        String login = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String pass  = scanner.nextLine();
        if (login.equals("admin") && pass.equals("123")){
            System.out.println("Доступ разрешен для Admin");
        }else if (login.equals("user") && pass.equals("321")){
            System.out.println("Доступ разрешен для User");
        }else{
            System.out.println("Доступ запрещен");
        }
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        //System.out.println(num1>num2?"Первое число больше":num1==num2?"Числа равны":"Второе число больше");
        if (num1>num2) System.out.println("Первое число больше");
        else if (num1 == num2) System.out.println("Числа равны");
        else System.out.println("Второе число больше");*/
    }
}
