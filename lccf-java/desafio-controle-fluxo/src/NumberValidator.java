public class NumberValidator {
    public static void numberValidator(int number) {
        switch (number) {
            case 1, 2, 3 -> System.out.println("Certo");
            case 4 -> System.out.println("Errado");
            case 5 -> System.out.println("Talvez");
            default -> System.out.println("Valor indefinido!");
        }
    }
}
