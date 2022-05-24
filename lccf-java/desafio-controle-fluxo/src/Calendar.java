public class Calendar {

    public static void monthFromNumber(int monthNumber) {
        // Simplified switch version and recommended approach:
        switch (monthNumber) {
            case 1 -> System.out.println("Janeiro");
            case 2 -> System.out.println("Fevereiro");
            case 3 -> System.out.println("Março");
            case 4 -> System.out.println("Abril");
            case 5 -> System.out.println("Maio");
            case 6 -> System.out.println("Junho");
            case 7 -> System.out.println("Julho");
            case 8 -> System.out.println("Agosto");
            case 9 -> System.out.println("Setembro");
            case 10 -> System.out.println("Outubro");
            case 11 -> System.out.println("Novembro");
            case 12 -> System.out.println("Dezembro");
            default -> System.out.println("Mês inválido!");
        }

        // Not recommended approach:
        if (monthNumber == 1) {
            System.out.println("Janeiro");
        } else if (monthNumber == 2) {
            System.out.println("Fevereiro");
        } else if (monthNumber == 3) {
            System.out.println("Março");
        } else if (monthNumber == 4) {
            System.out.println("Abril");
        } else if (monthNumber == 5) {
            System.out.println("Maio");
        } else if (monthNumber == 6) {
            System.out.println("Junho");
        } else if (monthNumber == 7) {
            System.out.println("Julho");
        } else if (monthNumber == 8) {
            System.out.println("Agosto");
        } else if (monthNumber == 9) {
            System.out.println("Setembro");
        } else if (monthNumber == 10) {
            System.out.println("Outubro");
        } else if (monthNumber == 11) {
            System.out.println("Novembro");
        } else if (monthNumber == 12) {
            System.out.println("Dezembro");
        } else {
            System.out.println("Mês inválido!");
        }

    }

    public static void startVacation(String month) {
        // Default (old) switch version:
        switch (month) {
            case "Janeiro":
            case "Julho":
            case "Dezembro":
                System.out.println("Férias!");
                break;
            default:
                System.out.println("Não é um mês de férias.");
                break;
        }

    }

    public static void numberFromWeekDay(String weekDay) {

        switch (weekDay) {
            case "Domingo" -> System.out.println(1);
            case "Segunda" -> System.out.println(2);
            case "Terça" -> System.out.println(3);
            case "Quarta" -> System.out.println(4);
            case "Quinta" -> System.out.println(5);
            case "Sexta" -> System.out.println(6);
            case "Sábado" -> System.out.println(7);
            default -> System.out.println("Dia inválido!");
        }

    }

}
