import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class OneDimensionalArraySolutions {

    public static void reverseOrder() {
        Random random = new Random();
        final int[] numbers = new int[5];

        System.out.println("Números: ");
        for (int i = 0; i < numbers.length; i++) {
            int randomNumber = random.nextInt(101);
            numbers[i] = randomNumber;
            System.out.print(randomNumber + " ");
        }
        System.out.println();

        System.out.println("Ordem inversa: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] +  " ");
        }
        System.out.println();
    }

    public static void consonants() {
        Scanner input = new Scanner(System.in);
        String[] characters = new String[6];
        String[] consonants = new String[6];
        int consonantsCounter = 0;

        for (int i = 0; i < characters.length; i++) {
            System.out.print("Digite uma letra: ");
            characters[i] = input.next();
            boolean isVowel = characters[i].equalsIgnoreCase("a") ||
                    characters[i].equalsIgnoreCase("e") ||
                    characters[i].equalsIgnoreCase("i") ||
                    characters[i].equalsIgnoreCase("o") ||
                    characters[i].equalsIgnoreCase("u");
            if (!isVowel) {
                consonants[i] = characters[i];
                consonantsCounter++;
            }
        }

        System.out.println("Total de consoantes: " + consonantsCounter);

        System.out.print("Consoantes: ");
        for (String consonant : consonants) {
            if (consonant != null) System.out.print(consonant + " ");
        }
        System.out.println();
    }

    public static void numbersSuccessors() {
        Random random = new Random();
        int[] numbers = new int[20];
        int[] successors = new int[20];

        for (int i = 0; i < numbers.length; i++) {
            int randomNumber = random.nextInt(101);
            numbers[i] = randomNumber;
            successors[i] = ++randomNumber;
        }

        System.out.println("Números: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("Sucessores: ");
        for (int successor : successors) {
            System.out.print(successor + " ");
        }
        System.out.println();
    }

}
