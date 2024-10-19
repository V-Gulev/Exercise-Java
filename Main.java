class LinkedList {

    static Node head;

    static class Node {
        int data;
        Node next_node;

        Node(int d) {
            data = d;
            next_node = null;
        }
    }

    Node reverse(Node node) {
        Node previousNode = null;
        Node currentNode = node;
        Node nextNode = null;
        while (currentNode != null) {
            nextNode = currentNode.next_node;
            currentNode.next_node = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        node = previousNode;
        return node;
    }

    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next_node;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(20);
        list.head.next_node = new Node(40);
        list.head.next_node.next_node = new Node(60);
        list.head.next_node.next_node.next_node = new Node(80);

        System.out.println("Original Linked list:");
        list.printList(head);

        head = list.reverse(head);

        System.out.println("");
        System.out.println("Reversed Linked list:");
        list.printList(head);
    }
}
