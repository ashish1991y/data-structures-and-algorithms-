package datastructures.singlyLinkedList;

public class SinglyOperation {
    public static void main(String[] args) {
        SinglyLinkedListUtil ssl = new SinglyLinkedListUtil();
        ssl.head = new SinglyLinkedListUtil.ListNode(2);
        SinglyLinkedListUtil.ListNode second = new SinglyLinkedListUtil.ListNode(6);
        SinglyLinkedListUtil.ListNode third = new SinglyLinkedListUtil.ListNode(10);
        SinglyLinkedListUtil.ListNode fourth = new SinglyLinkedListUtil.ListNode(18);
        ssl.head.next = second;
        second.next = third;
        third.next = fourth;

        //print singly list values
        ssl.printValue();

        //print singly list length
        System.out.println("list length:-"+ssl.listLength());

        //add new value in starting
        ssl.insertFirst(20);
        System.out.println("--updated list after first add--");
        ssl.printValue();

        //add new value in end
        ssl.insertEnd(30);
        System.out.println("--updated list after value added at end--");
        ssl.printValue();

        //add new value on given position
        ssl.insertValueAt(2,100);
        ssl.insertValueAt(3,101);
        ssl.insertValueAt(4,102);
        ssl.insertValueAt(5,103);
        ssl.insertValueAt(6,104);
        ssl.insertValueAt(7,105);

        System.out.println("--updated list after value added at end--");
        ssl.printValue();

        //delete first
        System.out.println("--updated list after deleting first value--");
        System.out.println("Deleted value:"+ssl.deleteFirst().data);
        ssl.printValue();

        //delete last
        System.out.println("--updated list after deleting last value--");
        System.out.println("Deleted value:"+ssl.deleteLast().data);
        ssl.printValue();

        //delete
        System.out.println("--updated list after deletion value from given position--");
        ssl.delete(3);
        ssl.printValue();
    }
}
