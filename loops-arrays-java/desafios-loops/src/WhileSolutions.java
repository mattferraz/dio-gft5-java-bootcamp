import java.util.Scanner;

public class WhileSolutions {

    public static void getNameAndAge() {
        final Scanner input = new Scanner(System.in);

        while(true) {
            System.out.print("Nome do aluno (Digite 0 para finalizar): ");
            String name = input.next();

            if (name.equals("0")) break;

            System.out.print("Idade do aluno: ");
            int age = input.nextInt();
        }

    }

    public static void getGrade() {
        final Scanner input = new Scanner(System.in);

        while(true) {
            System.out.print("Digite uma nota de 0 a 10: ");
            double grade = input.nextDouble();

            boolean isValidGrade = grade >= 0 && grade <= 10;
            if (isValidGrade) break;

            System.out.println("Nota inválida!");
        }

    }

}
