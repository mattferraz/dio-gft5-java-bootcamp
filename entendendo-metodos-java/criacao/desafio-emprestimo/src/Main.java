public class Main {

    public static void main(String[] args) {
        // Math Operations:
        System.out.println("Exercício Calculadora");
        int a = 30;
        int b = 10;

        Math.addition(a, b);
        Math.subtraction(a, b);
        Math.multiplication(a, b);
        Math.division(a, b);
        System.out.println("-".repeat(30));

        // Message:
        System.out.println("Exercício Mensagem");
        Message.showWelcomeMessage();
        System.out.println("-".repeat(30));

        // Loan:
        System.out.println("Exercício Empréstimo");
        Loan.getLoan(300000, 5);
        System.out.println("-".repeat(30));
    }

}
