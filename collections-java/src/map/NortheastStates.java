package map;

import java.util.*;

public class NortheastStates {
    public static void solve() {
        Map<String, Integer> states = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        states.replace("RN", 3534165);
        System.out.println(states);

        if (!states.containsKey("PB")) {
            states.put("PB", 4039277);
        }

        System.out.println(states);

        System.out.println("População de Pernambuco: " + states.get("PE"));

        System.out.println("Estados e populações em ordem de inserção:");
        Map<String, Integer> statesSorted = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(statesSorted);

        System.out.println("Estados e populações em ordem alfabética:");
        Map<String, Integer> statesSortedByName = new TreeMap<>(states);
        System.out.println(statesSortedByName);

        System.out.println("Estado(s) com a menor população:");
        int minPopulation = Collections.min(states.values());
        int maxPopulation = Collections.max(states.values());

        Set<Map.Entry<String, Integer>> statesSet = states.entrySet();
        for (Map.Entry<String, Integer> entry : statesSet) {
            if (entry.getValue() == minPopulation) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }

        System.out.println("Estado(s) com a maior população:");
        for (Map.Entry<String, Integer> entry : statesSet) {
            if (entry.getValue() == maxPopulation) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }

        Iterator<Integer> iterator = states.values().iterator();
        int sum = 0;
        while (iterator.hasNext()) {
            sum += iterator.next();
        }
        System.out.println("A soma da população dos estados: " + sum);

        System.out.println("A média da população dos estados: " + sum/states.size());

        states.values().removeIf(integer -> integer < 4000000);
        System.out.println("Estados com população maior que 4 milhoes:");
        System.out.println(states);

        states.clear();
        System.out.println("O map de estados está vazio? " + states.isEmpty());
    }
}
