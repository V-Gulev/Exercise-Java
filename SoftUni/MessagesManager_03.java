package SoftUni;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class MessagesManager_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int messagesCapacity = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();
        LinkedHashMap<String, List<Integer>> people = new LinkedHashMap<>();

        while (!input.equals("Statistics")) {
            String[] splitInput = input.split("=");
            String command = splitInput[0];
            String username = splitInput[1];

            switch (command) {
                case "Add":
                    if (!people.containsKey(username)) {
                        List<Integer> newUser = new ArrayList<>();
                        int sentMessages = Integer.parseInt(splitInput[2]);
                        int receivedMessages = Integer.parseInt(splitInput[3]);
                        newUser.add(sentMessages);
                        newUser.add(receivedMessages);
                        people.put(username, newUser);
                    }
                    break;
                case "Message":
                    String receiver = splitInput[2];
                    String sender = splitInput[1];
                    if (people.containsKey(sender) && people.containsKey(receiver)) {
                        List<Integer> send = people.get(sender);
                        List<Integer> receive = people.get(receiver);
                        send.set(0, send.get(0) + 1);
                        receive.set(1, receive.get(1) + 1);

                        if (send.get(0) + send.get(1) >= messagesCapacity) {
                            people.remove(sender);
                            System.out.printf("%s reached the capacity!\n", sender);
                        }

                        if (receive.get(0) + receive.get(1) >= messagesCapacity) {
                            people.remove(receiver);
                            System.out.printf("%s reached the capacity!\n", receiver);
                        }
                    }
                    break;
                case "Empty":
                    if (username.equals("All")) {
                        people.clear();
                    } else people.remove(username);
                    break;
                default:
                    break;
            }


            input = sc.nextLine();
        }


        System.out.printf("Users count: %d\n", people.size());
        people.forEach((s, integers) -> System.out.printf("%s - %d\n", s, integers.get(0) + integers.get(1)));


    }
}
