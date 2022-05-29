package list;

import java.util.*;

public class Temperature {
    public static void solve() {
        List<Double> temperatures = new ArrayList<>();
        List<String> months = Arrays.asList("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho");
        Scanner input = new Scanner(System.in);

        System.out.println("Informe as temperaturas dos meses de: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(months.get(i) + ": ");
            temperatures.add(input.nextDouble());
        }

        double temperatureAvarage = getTemperatureAvarage(temperatures);
        System.out.printf("Temperatura média do primeiro semestre: %.1f\n", temperatureAvarage);

        System.out.println("Temperaturas acima da média: ");
        int countTempAboveAvarage = 0;
        for (int i = 0; i < temperatures.size(); i++) {
            double temperature = temperatures.get(i);
            if (temperature > temperatureAvarage) {
                System.out.println(months.get(i) + ": " + temperature);
                countTempAboveAvarage += 1;
            }
        }
        if (countTempAboveAvarage == 0) System.out.println("Nenhuma temperatura acima da média.");
    }

    public static double getTemperatureAvarage(List<Double> temperatures) {
        Iterator<Double> iterator = temperatures.iterator();
        Double temperaturesSum = 0d;
        while (iterator.hasNext()) temperaturesSum += iterator.next();
        return temperaturesSum / temperatures.size();
    }

}
