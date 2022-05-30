package set.rainbow;

import java.util.*;

public class Rainbow {
    public static void solve() {
        Set<String> rainbowColors = new HashSet<>();
        Collections.addAll(rainbowColors, "Vermelho", "Laranja", "Amarelo",
                "Verde", "Azul", "Anil", "Violeta");

        System.out.println("Cores do arco-íris:");
        for (String color : rainbowColors) System.out.println(color);

        System.out.println("Quantidade de cores do arco-íris: " + rainbowColors.size());

        Set<String> rainbowColors2 = new TreeSet<>(rainbowColors);
        System.out.println("Cores em ordem alfabética:");
        for (String color : rainbowColors2) System.out.println(color);

        System.out.println("Cores na ordem inversa da que foi informada:");
        List<String> rainbowColors3 = new ArrayList<>(rainbowColors);
        Collections.reverse(rainbowColors3);
        for (String color : rainbowColors3) System.out.println(color);

        Iterator<String> iterator = rainbowColors.iterator();
        System.out.println("Cores que começam com 'v': ");
        while (iterator.hasNext()) {
            String color = iterator.next();
            if (color.toLowerCase().startsWith("v")) {
                System.out.println(color);
                iterator.remove();
            }
        }

        rainbowColors.clear();
        System.out.println("O conjunto está vazio? " + rainbowColors.isEmpty());
    }
}
