public class TwoSum_2 {
    public static void main() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // Create second list: 5 -> 6 -> 4
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode result= addTwoNumbers(l1,l2);
        printList(result);

    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        System.out.println("in ");
        ListNode temp=new ListNode();
        ListNode result=temp;
        int sum=0,c=0;
        while (l1!=null || l2!=null ||c!=0){
             sum=c;
             if(l1!=null){
                 sum+=l1.val;
                 l1=l1.next;
             }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            int rem=sum%10;
            temp.next=new ListNode(rem);
            c=sum/10;
            temp=temp.next;
        }
        return result.next;
    }
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) System.out.print(" -> ");
            node = node.next;
        }
        System.out.println();
    }
}
