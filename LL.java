public class LL {
    
    public class Node {
    
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head ;
    Node tail ;

    public void add_first(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void add_last(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void reveselist(){
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node curNode = head.next;
        while (curNode != null) {
            Node nextNode = curNode.next;
            curNode.next = prevNode;
            prevNode = curNode;

            curNode = nextNode;
        }

        head.next = null;
        head = prevNode;
    }

    public void delete_head(){
        if (head == null ) {
            return;
        }

       head = head.next;
    }

    public int delete_tail(){
        if (head == null || head.next == null) {
            return 0;
        }
        Node curNode = head;
        while (curNode.next.next != null) {
            curNode = curNode.next;
        }
        int element = curNode.next.data;
        curNode.next = null;
        return element;
    }
    
    public void removeK(int k){
        if (head == null) {
            return;
        }
        if (k == 1) {
            head = head.next;
            return;
        }

        int cnt = 0 ;
        Node temp = head;
        Node  prev = null;

        while (temp != null) {
            cnt++;
            if (cnt == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
    }

    public void removeEL(int E){
        if (head == null) {
            return;
        }
        if (head.data == E) {
            head = head.next;
            return;
        }
        Node temp = head;
        Node  prev = null;

        while (temp != null) {
            if (temp.data == E) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
    }

    public void insert_K(int data,int k){
        Node newNode = new Node(data);
        if (head == null) {
            return;
        }
        if (k == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        int cnt = 1 ;
        Node temp = head;
       while (temp != null && cnt < k-1) {
            temp = temp.next;
            cnt++;
       }
       if (temp == null) {
            return ;
       }
       newNode.next = temp.next;
       temp.next = newNode;
    }
     
    public void insert_EL_after(int data,int E){
        Node newNode = new Node(data);
        if (head == null) {
            return;
        }
        
        Node temp = head;
       while (temp != null && temp.data != E  ) {
            temp = temp.next;
            
       }
       if (temp == null) {
            return ;
       }
       newNode.next = temp.next;
       temp.next = newNode;
       
    }

    public void insert_EL_before(int data,int E){
        Node newNode = new Node(data);
        if (head == null) {
            return;
        }
        if (head.data == E) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node prev= null;
        Node temp = head;
       while (temp != null && temp.data != E  ) {
            prev = temp;
            temp = temp.next;

            
       }
       if (temp == null) {
            return ;
       }
       prev.next = newNode;
       newNode.next = temp;
       
    }

    public int print_LL(){
        int count  = 0;
        if (head == null) {
            System.out.println("the list is empty");
        }

        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data + " ");
            curNode = curNode.next;
            count += 1;
        }
        return count;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.add_last(1);
        list.add_last(2);
        list.add_last(3);
        list.add_first(0);
        list.add_last(4);
        // int count = list.print_LL();
        list.print_LL();
        System.out.println();
        list.insert_EL_after(100, 0);
        list.print_LL();

    }
}
