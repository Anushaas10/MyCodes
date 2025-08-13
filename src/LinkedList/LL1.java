package LinkedList;

public class LL1 {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertFirst(19);
        list.insert(30, 2);
        System.out.println(list.deleteFirst());
        list.display();
    }
}
