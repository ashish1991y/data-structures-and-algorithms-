package datastructures.singlyLinkedList;

public class SinglyLinkedListUtil {
    public ListNode head;

    public static class ListNode {
        public int data;
        public ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void printValue() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("end");
    }

    public int listLength() {
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void insertFirst(int value) {
        ListNode newValue = new ListNode(value);
        newValue.next = head;
        head = newValue;
    }

    public void insertEnd(int value) {
        ListNode newValue = new ListNode(value);
        if (head == null) {
            head = newValue;
            return;
        }
        ListNode current = head;
        while (null != current.next) {
            current = current.next;
        }
        current.next = newValue;
    }

    public void insertValueAt(int position,int value){
        ListNode valueToInsert= new ListNode(value);
        if(position == 1){
            valueToInsert.next=head;
            head = valueToInsert;
            }else{
            ListNode previousNode = head;
            int count=1;
            while(count < position-1){
                previousNode=previousNode.next;
                count++;
            }
            valueToInsert.next=previousNode.next;
            previousNode.next=valueToInsert;
        }
        }

        public ListNode deleteFirst(){
        if(head ==null){
           return null;
        }
        ListNode tempValue=head;
            head = head.next;
            tempValue.next=null;
            return  tempValue;
        }

    public ListNode deleteLast(){
        if(head ==null && head.next==null){
            return head;
        }
        ListNode current=head;
        ListNode previous=null;
        while (current.next!=null){
        previous=current;
        current=current.next;
        }
        previous.next=null;
        return  current;
    }

    public void delete(int position) {
        if (position == 1) {
            head = head.next;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position-1) {
                previous = previous.next;
                count++;
            }
            ListNode current= previous.next;
            previous.next = current.next;
        }
    }
}
