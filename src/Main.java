import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int number1 = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("Введите второе число:");
        int number2 = Integer.parseInt(new Scanner(System.in).nextLine());
        int sum = number1 + number2;
        int dif = number1 - number2;
        int multi = number1 * number2;
        double quotient = (double) number1/number2;

        System.out.println("Сумма чисел равна: " + sum);
        System.out.println("Разница чисел равна: " + dif);
        System.out.println("Произведение чисел равно: " + multi);
        System.out.println("Частное чисел равно: " + quotient);
    }
}
