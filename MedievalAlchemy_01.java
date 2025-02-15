import java.util.*;

public class MedievalAlchemy_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> substances = new Stack<>();
        Queue<Integer> crystal = new ArrayDeque<>();

        Arrays.stream(sc.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).forEach(substances::push);
        Arrays.stream(sc.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).forEach(crystal::offer);
        int craftedPotions = 0;
        TreeMap<Integer, String> potions = new TreeMap<>(Map.of(110, "Brew of Immortality", 100, "Essence of Resilience",
                90, "Draught of Wisdom", 80, "Potion of Agility", 70, "Elixir of Strength"));
        List<String> craftedPotionsNames = new ArrayList<>();

        while (!substances.isEmpty() && !crystal.isEmpty() && craftedPotions < 5) {
            int sub = substances.peek();
            int crystalValue = crystal.peek();
            int sum = sub + crystalValue;

            if (potions.containsKey(sum)) {
                substances.pop();
                crystal.poll();
                craftedPotionsNames.add(potions.get(sum));
                potions.remove(sum);
                craftedPotions++;

            } else {
                String name = "";
                int energy = 0;
                for (Map.Entry<Integer, String> entry : potions.entrySet()) {
                    if (entry.getKey() <= sum) {
                        name = entry.getValue();
                        energy = entry.getKey();
                    }
                }
                substances.pop();
                crystal.poll();
                if (energy != 0) {
                    if (crystalValue - 20 > 0) {
                        crystal.offer(crystalValue - 20);
                    }
                    potions.remove(energy);
                    craftedPotionsNames.add(name);
                    craftedPotions++;
                } else {
                    if (crystalValue - 5 > 0) {
                        crystal.offer(crystalValue - 5);
                    }
                }


            }


        }

        if (craftedPotions == 5) {
            System.out.println("Success! The alchemist has forged all potions!");
        } else {
            System.out.println("The alchemist failed to complete his quest.");
        }
        if (!craftedPotionsNames.isEmpty()) {
            System.out.println("Crafted potions: " + String.join(", ", craftedPotionsNames));
        }
        if (!substances.isEmpty()) {
            System.out.print("Substances: " + substances.pop());
            while (!substances.isEmpty()) {
                System.out.print(", " + substances.pop());
            }
            System.out.println();
        }

        if (!crystal.isEmpty()) {
            System.out.print("Crystals: " + crystal.poll());
            while (!crystal.isEmpty()) {
                System.out.print(", " + crystal.poll());
            }
        }

    }
}
