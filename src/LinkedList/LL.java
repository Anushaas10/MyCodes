package LinkedList;

public class LL {

    private node head;
    private node tail;
    private int size;

    public LL() {
        this.size=0;
    }

    public void insert(int val, int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        node temp= head;
        for(int i=1;i<index;i++){
            temp= temp.next;
        }
        node node= new node(val,temp.next);
        temp.next=node;

        size++;

    }

    public void insertFirst(int val){
        node newNode = new node(val);
        newNode.next=head;
        head=newNode;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }

    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        node newNode= new node(val);
        tail.next=newNode;
        tail=newNode;
        size++;
    }

    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        node prev= get(index-1);
        int value= prev.next.value;
        prev.next= prev.next.next;
        size--;
        return value;
    }

    public int deleteFirst(){
        int val=head.value;
        head= head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

    public node get(int index){
        node node= head;
        for(int i=0;i<index;i++){
            node= node.next;
        }
        return node;
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        node secondLast= get(size - 2);
        int val=tail.value;
        tail=secondLast;
        tail.next= null;
        size--;
        return val;
    }

    public void display(){
        node temp = head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.println("End");
    }


    private class node{
        private int value;
        private node next;
        public node(int value){
            this.value = value;
        }
        public node(int value,node next){
            this.value = value;
            this.next = next;
        }
    }
}
