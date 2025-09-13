public class search_recursive {
    
        // Node definition
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Public wrapper function (no need to pass index)
    public static int search(Node head, int key) {
        return searchHelper(head, key, 0);
    }

    // Actual recursive helper with index tracking
    private static int searchHelper(Node head, int key, int index) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return index;
        }
        return searchHelper(head.next, key, index + 1);
    }

    public static void main(String[] args) {
        // Hardcoded linked list: 10 -> 20 -> 30 -> 40
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        int key = 30;

        int result = search(head, key);

        if (result != -1) {
            System.out.println("Key " + key + " found at index: " + result);
        } else {
            System.out.println("Key " + key + " not found.");
        }
    }
}
