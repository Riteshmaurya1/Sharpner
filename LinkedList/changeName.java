class Node<T>{
    T data;
    Node next;
    Node(){
        this.next = null;
    }
    Node(T data){
        this.data = data;
        this.next = null;
    }
}
public class changeName<T>{
        Node<T> head;
        int size;
        changeName(){
            this.head = null;
            this.size = 0;
        } 
    
    //  Insert At Any Specific Position.
    public void insertNode(T data, int position){
        //  if user is enter a wrong postion then 
        if(position > size+1 && position <= 0){
            System.out.println("Index out of Bound : . . . :");
            return;
        }
        // if LL have only one Node then.
        if(position == 1){
            insertFirst(data);
        } else if(position == size+1 ){
            insertLast(data);
        }
        else{
            int counter = 1;
            Node<T> newNode = new Node<>(data);
            Node <T> temp = head;
            while(counter < position-1 && temp != null){
                counter++;
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
            System.out.println("Insertion at Specific ....."+position);
        }
    }
    //  Insert At Head.
    public void insertFirst(T data){
        // Create a new node.
        Node<T> newNode = new Node<>(data);
        //  Then check if LL is empty , set Newnode as head.
        if(head == null){
            head = newNode;
            System.out.println("Successfully added at first....");
            size++;
            return;
        }
        // If LL is not empty then 
        newNode.next = head;
        head = newNode;
        size++;
    }
    public void insertLast(T data){
        // Create a new node.
        Node<T> newNode = new Node<>(data);
        //  Then check if LL is empty , set Newnode as head.
        if(head == null){
            head = newNode;
            System.out.println("Successfully added at Last....");
            size++;
            return;
        }
        // If LL is not empty then create a Node as temp, that is points head.
        Node<T> temp = head;
        // and check the temp-> next != null.
        while(temp.next != null){
            temp = temp.next;
        }
        // update the temp ->next = to current node.
        temp.next = newNode;
        System.out.println("Successfully added at Last....");
        size++;
    }
// Print the LinkedList.
    public void printList(){
        Node<T> temp = head;
        System.out.print("Data ");
        while(temp != null){
            System.out.print(" -> "+temp.data);
            temp = temp.next;
        }
    }
    public static void main(String [] args){
        changeName<String> ll = new changeName<>();
        ll.insertFirst("Ritesh");
        ll.printList();
        ll.insertLast("Maurya");
        ll.printList();
        ll.insertNode("Kumar",2);
        ll.printList();
    }
}