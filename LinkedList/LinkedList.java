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
    public static int size;
    public void addFirst(int data){
        //step1: create new node
        Node newNode=new Node(data);
        size++;
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
        size++;
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
        size++;
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
    public int removeFirst(){
        if(size==0){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        //find second last node
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data; //tail.data
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public int itrSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){ //key found
                return i;
            }
            temp=temp.next;
            i++;
        }
        //key not found
        return -1;
    }
    public int recSearch(int key){
        return recSearchHelper(head,key);
    }
    private int recSearchHelper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=recSearchHelper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public static boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next; //+1
            fast=fast.next.next; //+2
            if(slow==fast){
                return true; //cycle exists
            }
        }
        return false; //cycle does not exist
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
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2,3);
        ll.print();
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        System.out.println(ll.recSearch(3));
        System.out.println(ll.recSearch(10));
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=head;
        //1->2->3
        System.out.println(isCycle());
    }
}