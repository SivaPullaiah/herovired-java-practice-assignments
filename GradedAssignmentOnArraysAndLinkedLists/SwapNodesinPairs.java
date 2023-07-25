class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = head;

        while (head != null && head.next != null) {
            ListNode first = head;
            ListNode second = head.next;
            int temp = first.val;
            first.val=second.val;
            second.val=temp;
            head=second.next;
        }

        return dummy;
    }
    
}