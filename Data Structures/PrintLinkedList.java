/**
 * @author Brianna Barkema.
 * WorkAtTech
 * Prints all nodes of linked list
 */
class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
public class PrintLinkedList {
    void printLinkedList (ListNode head) {
        ListNode first = head;
        while(first != null){
            System.out.print(first.data + " ");
            first = first.next;
        }
    }
}
