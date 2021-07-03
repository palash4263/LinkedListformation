public class LinkedListUse {


    public static void print(Node<Integer> head){

        int count = 0;
        Node<Integer> temp = head;

        while (head != null) {
            System.out.print(head.data + " ");
            count++;
            head =  head.next;

        }

        System.out.println(count);




    }

    public static void main(String[] args) {

        Node<Integer> node1 = new Node<Integer>(20);
        Node<Integer> node2 = new Node<Integer>(30);
        Node<Integer> node3 = new Node<Integer>(40);
        Node<Integer> node4 = new Node<Integer>(70);
        Node<Integer> node5 = new Node<Integer>(80);


        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        Node<Integer> head = node1;

        print(head);







    }





}
