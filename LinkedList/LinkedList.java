class Node {
    int data;
    Node next;

    Node() {
        this.next = null;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    Node head;
    int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(25);
        ll.addLast(5);
        ll.addLast(0);
        ll.addPosition(15, 3);
        ll.search(10);
        ll.deleteFirst();
        ll.deleteLast();
        ll.addPosition(40, 2);
        ll.printLL();
        ll.deletePosition(2);
        ll.printLL();
    }

    public void addFirst(int data) {
        // create a new node;
        Node newNode = new Node(data);

        // check LL is empty or not
        if (head == null) {
            head = newNode;
            System.out.println("Add at First");
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        System.out.println("Add at First");
        size++;
    }
    
    public void deleteFirst() {
        // create a newNode
        Node temp = head;
        // check LL is empty or not
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        }
        head = head.next;
        temp.next = null;
        System.out.println("Delete at First");
        size--;
    }

    public void addLast(int data) {
        // create a new node;
        Node newNode = new Node(data);

        // check LL is empty or not
        if (head == null) {
            head = newNode;
            System.out.println("Add at Last");
            size++;
            return;
        }
        // create a new Node
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        System.out.println("Add at Last");
        size++;
    }

    public void deleteLast() {
        // check LL is empty or not
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        if(head.next == null){
            head = null;
        System.out.println("Delete at Last");
        size--;
        }
        // create a new Node
        Node temp = head;
        Node prev = null;

        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        System.out.println("Delete at Last");
        size--;
    }

    public void addPosition(int data, int position) {
        // chek if user is enter not valid position
        if (position > size + 1 && position <= 0) {
            System.out.println("Invalid position..");
        }
        // if ll have only one node then
        if (position == 1) {
            addFirst(data);
        } else if (position == size + 1) {
            addLast(data);
        } else {
            int counter = 1;

            // create a Node as NewNode and temp;
            Node newNode = new Node(data);
            Node temp = head;

            // condtion for reching position
            while (counter < position - 1 && temp != null) {
                counter++;
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            System.out.println("add at Postion " + position);
            size++;
        }
    }

    public void deletePosition(int position) {
        // chek if user is enter not valid position
        if (position > size || position <= 0) {
            System.out.println("Invalid position..");
        }
        // if ll have only one node then
        if (position == 1) {
            deleteFirst();
        } else if (position == size + 1) {
            deleteLast();
        } else {
            int counter = 1;

            // create a Node as prev with null and temp with head;
            Node prev = null;
            Node temp = head;

            // condtion for reching position
            while (counter < position && temp != null) {
                prev = temp;
                counter++;
                temp = temp.next;
            }
            prev.next = temp.next;
            temp.next = null;
            System.out.println("Delete at Postion " + position);
            size--;
        }
    }

    public void search(int data){
        Node temp = head;
        int count = 0;
        while(temp!= null){
            if(temp.data == data){
                count++;
                System.out.println("Element found at : "+count);
            }
            temp = temp.next;
        }
        if(count == 0)
        System.out.println("Element not found in LL..");
    }

    public void printLL() {
        Node temp = head;
        System.out.print("LL is : ");
        while (temp != null) {
            System.err.print(" -> " + temp.data);
            temp = temp.next;
        }
    }
}