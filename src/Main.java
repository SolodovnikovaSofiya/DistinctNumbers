import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Integer> uniqueNumbers = new ArrayList<>();

            System.out.println("Введите числа (введите 0 для завершения):");
            while (true) {
                int num = scanner.nextInt();
                if (num == 0) {
                    break;
                }
                if (!uniqueNumbers.contains(num)) {
                    uniqueNumbers.add(num);
                }
            }

            System.out.println("Несовпадающие числа:");
            uniqueNumbers.forEach(System.out::println);
        }
    }
}