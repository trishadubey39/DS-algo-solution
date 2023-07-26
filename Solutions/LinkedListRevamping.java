package Solutions;

public class LinkedListRevamping {
    public static void main(String[] args) {
        // {1,2,2,1,2,0,2,2}
        LinkNode head = new LinkNode(1);
        head.next = new LinkNode(2);
        head.next.next = new LinkNode(2);
        head.next.next.next = new LinkNode(1);
        head.next.next.next.next = new LinkNode(2);
        head.next.next.next.next.next = new LinkNode(0);
        head.next.next.next.next.next.next = new LinkNode(2);
        head.next.next.next.next.next.next.next = new LinkNode(2);

        LinkNode nodes = segregate(head);
    }

    // Function to sort a linked list of 0s, 1s and 2s.
    static LinkNode segregate(LinkNode head) {
        // add your code here
        LinkNode heads = head;
        int zeros = 0;
        int ones = 0;
        int twos = 0;
        while (heads != null) {
            if (heads.data == 0)
                zeros++;
            if (heads.data == 1)
                ones++;
            if (heads.data == 2)
                twos++;
            heads = heads.next;
        }
        System.out.println("0s " + zeros + "1s " + ones + "twos " + twos);
        heads = head;
        while (heads != null) {
            if (zeros < 0) {
                heads.next = new LinkNode(0);
                heads = heads.next;
                zeros--;
            } else if (ones < 0) {
                heads.next = new LinkNode(1);
                heads = heads.next;
                ones--;
            } else if (twos < 0) {
                heads.next = new LinkNode(2);
                heads = heads.next;
                twos--;
            }
        }
        return head;

    }

    static class LinkNode {
        int data;
        LinkNode next;

        LinkNode(int data) {
            this.data = data;
            next = null;
        }
    }

}
