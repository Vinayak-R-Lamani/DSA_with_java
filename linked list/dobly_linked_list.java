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
    
    public void add_element(int data,int pos){
        if (head == null) {
            head = tail = new Node(data);
            return;
        }

        
        Node current = head;
        int count = 1;
        while (current != null && count <  pos-1) {
            current = current.front;
            count++;
        }
        if (current == null) {
            return;
        }

        Node newNode = new Node(data);

        if(pos ==  1){
            head.back = newNode;
            newNode.front = head;
            head = newNode;
            return;
            
        }


        if (current == null || current.front == null) {
            tail.front = newNode;
            newNode.back = tail;
            tail = newNode;
            return;
        }
       
        newNode.front = current.front;
        current.front.back = newNode;
        newNode.back = current;
        current.front = newNode;
        
    }

    public void delete_element(int pos){
        Node current = head;
        int count  = 1;
        if (head == null) {
            return;
        }

        if (pos == 1) {
            head = head.front;
            head.back = null;
            return;
        }

        while (current != null && count < pos -1) {
            current = current.front;
            count ++;
        }

        if (current == null || current.front == null) {
            tail = tail.back;
            tail.front = null;
            return;
        }

        current.front = current.front.front;
        current.front.back = current;



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

        dll.add_element(6, 1);
        

        System.out.println("Forward Traversal:");
        dll.printForward();

        System.out.println("Backward Traversal:");
        dll.printBackward();

        System.out.println("\n\n\n");

        dll.delete_element(3);
        System.out.println("Forward Traversal:");
        dll.printForward();
        System.out.println("\n\n\n");
        System.out.println("Backward Traversal:");
        dll.printBackward();
        
        

    }
}