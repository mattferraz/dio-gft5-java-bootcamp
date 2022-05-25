import java.util.Scanner;

public class DoWhileSolutions {

    public static void higherAndAverage() {
        Scanner input = new Scanner(System.in);

        int cont = 0;
        int higherNumber = 0;
        int sum = 0;

        do {
            System.out.print("Digite um número inteiro: ");
            int number = input.nextInt();
            sum += number;

            if (cont == 0) {
                higherNumber = number;
            }
            else if (number > higherNumber) {
                higherNumber = number;
            }

            cont++;
        } while (cont < 5);

        double average = (double) sum / 5;

        System.out.println("Maior número: " + higherNumber);
        System.out.println("Média: " + average);
    }

    public static void evenAndOdd() {
        Scanner input = new Scanner(System.in);

        boolean isEnough = false;
        int evenQtt = 0;
        int oddQtt = 0;

        do {
            System.out.print("Digite um número inteiro: ");
            int number = input.nextInt();

            if (number % 2 == 0) evenQtt++;
            else oddQtt++;

            System.out.print("Deseja continuar? [S/N] ");
            String answer = input.next();

            if (answer.equalsIgnoreCase("n")) {
                isEnough = true;
            }

        } while (!isEnough);

        System.out.println("-".repeat(30));

        System.out.println("Quantidade de Pares: " + evenQtt);
        System.out.println("Quantidade de Ímpares: " + oddQtt);
    }

}
