package SoftUni;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogic_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfHeroes = Integer.parseInt(sc.nextLine());
        Map<String, Integer> heroHP = new LinkedHashMap<>();
        Map<String, Integer> heroMP = new LinkedHashMap<>();

        for (int i = 0; i < numberOfHeroes; i++) {
            String[] heroStats = sc.nextLine().split(" ");
            heroHP.put(heroStats[0], Integer.valueOf(heroStats[1]));
            heroMP.put(heroStats[0], Integer.parseInt(heroStats[2]));
        }

        String input = sc.nextLine();
        while (!input.equals("End")) {
            String[] splitInput = input.split(" - ");
            String command = splitInput[0];
            String heroName = splitInput[1];
            int amount = Integer.parseInt(splitInput[2]);
            switch (command) {
                case "CastSpell":
                    String spellName = splitInput[3];

                    if (heroMP.get(heroName) >= amount) {
                        heroMP.put(heroName, heroMP.get(heroName) - amount);
                        System.out.printf("%s has successfully cast %s and now has %d MP!\n", heroName, spellName, heroMP.get(heroName));
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!\n", heroName, spellName);
                    }

                    break;
                case "TakeDamage":
                    String attacker = splitInput[3];
                    heroHP.put(heroName, heroHP.get(heroName) - amount);

                    if (heroHP.get(heroName) > 0) {
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!\n", heroName, amount, attacker, heroHP.get(heroName));
                    } else {
                        heroMP.remove(heroName);
                        heroHP.remove(heroName);
                        System.out.printf("%s has been killed by %s!\n", heroName, attacker);
                    }

                    break;
                case "Recharge":
                    int currentMP = heroMP.get(heroName);
                    heroMP.put(heroName, heroMP.get(heroName) + amount);
                    if (heroMP.get(heroName) > 200) {
                        heroMP.put(heroName, 200);
                        System.out.printf("%s recharged for %d MP!\n", heroName, 200 - currentMP);
                    } else {
                        System.out.printf("%s recharged for %d MP!\n", heroName, amount);
                    }
                    break;
                case "Heal":
                    int currentHP = heroHP.get(heroName);
                    heroHP.put(heroName, heroHP.get(heroName) + amount);
                    if (heroHP.get(heroName) > 100) {
                        heroHP.put(heroName, 100);
                        System.out.printf("%s healed for %d HP!\n", heroName, 100 - currentHP);
                    } else {
                        System.out.printf("%s healed for %d HP!\n", heroName, amount);
                    }
                    break;
                default:
                    break;
            }


            input = sc.nextLine();
        }

        for (Map.Entry<String, Integer> entry : heroHP.entrySet()) {
            System.out.printf("%s\n  HP: %d\n  MP: %d\n", entry.getKey(), heroHP.get(entry.getKey()), heroMP.get(entry.getKey()));
        }


    }
}
