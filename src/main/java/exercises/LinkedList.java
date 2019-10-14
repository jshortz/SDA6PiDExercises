package exercises;

class Node {

    int elem;
    Node next;

    public Node (int elem, Node next) {
        this.elem = elem;
        this.next = next;
    }
}

// LinkedList is going to use nodes to store the elements of the list, so we create Node class first

public class LinkedList {
    Node first = null;

    // First method to add an Integer elem to list
    public void add(int elem) {
        if (first == null) { // would mean the list is empty
            Node n = new Node(elem, null);
            first = n;
        } else {
            // last node is the node where next is null
            Node current = first;
            while (current.next != null) {
                current = current.next;
            } // at end, current will be the last node, because it will be the one where next is null
            Node last = current;
            last.next = new Node(elem, null);
        }
    }

    public int get(int index) {
        int counter = 0;
    }
}
