package list;

import java.util.*;

public class Crime {
    public static void solve() {
        List<String> questions = List.of(
                "Telefonou para a vítima?",
                "Esteve no local do crime?",
                "Mora perto da vítima?",
                "Devia para a vítima?",
                "Já trabalhou com a vítima?"
        );
        List<String> answers = new ArrayList<>();
        Iterator<String> iterator = questions.iterator();
        Scanner input = new Scanner(System.in);

        System.out.println("Responda as perguntas abaixo com S para sim e N para não: ");
        while (iterator.hasNext()) {
            String question = iterator.next();
            System.out.print(question + " (S/N) ");
            answers.add(input.next().toUpperCase());
        }

        int quantityOfYes = Collections.frequency(answers, "S");

        System.out.print("Diante das respostas, a classificação do indivíduo é: ");
        switch (quantityOfYes) {
            case 2 -> System.out.println("SUSPEITO");
            case 3, 4 -> System.out.println("CÚMPLICE");
            case 5 -> System.out.println("ASSASSINO");
            default -> System.out.println("INDEFINIDO");
        }

    }
}
