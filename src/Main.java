import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList numbers = new ArrayList<>();

        System.out.println("Введите числа:");
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            if (!numbers.contains(num)) {
                numbers.add(num);
            }
        }
        System.out.println("Несовпадающие числа:");
        for (Object number : numbers) {
            System.out.println(number);
        }
        //закрываем scanner
        scanner.close();
    }
}