public class dobly_linked_list {
    /**
     * Node
     */
     class Node {
        int data;
        Node back;
        Node front;

        Node(int data){
            this.data = data;
            this.back = null;
            this.front = null;
        }
        
    }
    Node head;
    Node tail;

    public void add(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }else{
            tail.front = newNode;
            newNode.back = tail;
            tail = newNode;
        }

    }

    public void delete_head() {
        if (head == null || head.front == null) {
            return ;
        }
        Node prev = head;
        head = head.front;

        head.back = null;
        prev.front = null;

    }

    public void delete_tail(){
        if (head == null || head.front == null) {
            return ;
        }
        Node prev = tail;
        tail = tail.back;
        tail.front = null;
        prev.back = null;
    }
    
    public void printForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.front;
        }
        System.out.println("null");
    }

    // Print the list from tail to head
    public void printBackward() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.back;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        dobly_linked_list dll = new dobly_linked_list();
        dll.add(1);
        dll.add(2);
        dll.add(3);
        dll.add(4);
        dll.add(5);

        System.out.println("Forward Traversal:");
        dll.printForward();

        System.out.println("Backward Traversal:");
        dll.printBackward();

        System.out.println();
        System.out.println();

        dll.delete_head();

        System.out.println("Forward Traversal:");
        dll.printForward();

        System.out.println("Backward Traversal:");
        dll.printBackward();
        

    }
}