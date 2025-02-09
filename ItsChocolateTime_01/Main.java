package ItsChocolateTime_01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Double> milkQueue = new ArrayDeque<>();
        Deque<Double> cacaoStack = new ArrayDeque<>();

        Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .forEach(milkQueue::offer);

        Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .forEach(cacaoStack::push);

        int milkChocolate = 0;
        int darkChocolate = 0;
        int bakingChocolate = 0;


        while (!cacaoStack.isEmpty() && !milkQueue.isEmpty()) {

            double milk = milkQueue.peek();
            double cacao = cacaoStack.peek();
            double chocolatePercentage = cacao / (milk + cacao) * 100;

            if (chocolatePercentage == 30) {
                milkChocolate++;
                milkQueue.poll();
                cacaoStack.pop();
            } else if (chocolatePercentage == 50) {
                darkChocolate++;
                milkQueue.poll();
                cacaoStack.pop();
            } else if (chocolatePercentage == 100) {
                bakingChocolate++;
                milkQueue.poll();
                cacaoStack.pop();
            } else {
                milkQueue.poll();
                cacaoStack.pop();
                milkQueue.offer(milk += 10);
            }

        }

        if (milkChocolate != 0 && darkChocolate != 0 && bakingChocolate != 0) {
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
        } else {
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
        }

        Map<String, Integer> chocolates = new TreeMap<>(Map.of("Baking Chocolate", bakingChocolate, "Dark Chocolate",darkChocolate, "Milk Chocolate", milkChocolate));
        chocolates.forEach((s, integer) -> {
            if (integer != 0) {
                System.out.printf("# %s --> %d\n", s,integer);
            }
        });

    }
}
