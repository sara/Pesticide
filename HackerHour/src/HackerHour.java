public class HackerHour {


    //increment a turn iterator, if the number is odd print 'x' if even print 'y'
    public static void checkIfValid() {

        while (true) {
            int counter = 0;
            if (counter % 2 == 0) {
                System.out.println("x");
            } else {
                System.out.println("y");
            }
                counter += 1;
            }
        }

    //determine if a string is a palindrome
    public static boolean isPalindrome (String s)
    {
        for (int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) != s.charAt(s.length()-i)) return false;
        }
        return true;
    }


    //delete all matching elements to target from a linked list and return the list
    public static Node deleteMatch(Node n, int target)
    {
        Node curr = n.next;
        Node prev = n;
        while (curr.next != null)
        {
            if (curr.num == target) {
                prev.next = curr.next;
            }
        }
        return curr;
    }

    public static Node makeList()
    {
        Node head = new Node(1);
        Node ptr = head;
        ptr.next = new Node(2);
        ptr = ptr.next;
        ptr.next = new Node(3);
        ptr = ptr.next;
        ptr.next = new Node(1);
        ptr = ptr.next;
        ptr.next = new Node(2);
        ptr = ptr.next;
        ptr.next = new Node(1);
        return head;
    }

    public static void main(String [] args)
    {
        checkIfValid();

        System.out.println(isPalindrome("racecar"));

        Node list = makeList();

        list = deleteMatch(list, 1);

    }

}
