import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner veri = new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int number = veri.nextInt();
        int total = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;
            }
        }
        if (total == number) {
            System.out.println("Mükemmel sayıdır");
        } else {
            System.out.println("mükemmel sayı değildir");
        }

    }
}

