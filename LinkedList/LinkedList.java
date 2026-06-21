public class LinkedList{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=next;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
        //step1: create new node
        Node newNode=new Node(data);
        //when linked list is empty
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step2: newNode next=head
        newNode.next=head;
        //step3: head=newNode
        head=newNode;
    }
    public void addLast(int data){
        //step1: createnew node
        Node newNode=new Node(data);
        //when linked list is empty
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step2: tail next=newNode
        tail.next=newNode;
        //step3: tail=newNode
        tail=newNode;
    }
    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        //step1: create new node
        Node newNode=new Node(data);
        //step2: find prev and curr
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        //step3: newNode next=curr
        newNode.next=temp.next;
        //step4: prev next=newNode
        temp.next=newNode;
    }
    public void print(){
        Node temp=head;
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2,9);
        ll.print();
    }
}