import java.util.Scanner;
public class Cycles_java2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();

        System.out.println("Числа от 1 до " + N + ", у которых последние цифры совпадают с последними цифрами их квадратов:");
        for (int i = 1; i <= N; i++) {
            int square = i * i;
            if (getLastDigit(i) == getLastDigit(square)) {
                System.out.println(i);
            }
        }
    }

    public static int getLastDigit(int number) {
        return number % 10;
    }

}
