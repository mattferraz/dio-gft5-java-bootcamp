import java.util.Scanner;

public class ForSolutions {

    public static void multiplicationTable() {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro entre 1 e 10 para ver a sua tabuada: ");
        int number = input.nextInt();

        System.out.printf("Tabuada de %d:\n", number);
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %2d = %d\n", number, i, number * i);
        }

    }

    public static void getFactorial() {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro para calcular o seu fatorial: ");
        int number = input.nextInt();
        int factorial = 1;

        for (int i = number; i >= 1; i--) {
            factorial *= i;
        }

        System.out.printf("%d! = %d", number, factorial);
    }

}
