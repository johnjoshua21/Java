//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Lnklist obj=new Lnklist();
        obj.insertatbeg(21);
        obj.insertatbeg(5);
        obj.inseratlast(44);
        obj.inseratlast(305);
        obj.insertatspef(54,3);
        obj.search(305);
        obj.delete(44);
        System.out.println("Head of our ll is:"+obj.rethead());
        obj.display();

    }
}
class Node{
    int data;
    Node next;
}


class Lnklist{
    Node head;



    public void display() {
        Node temp=head;
        int i=0;
        System.out.println();
        while (temp!=null){
            System.out.println();
            System.out.printf("%d number of the list is: %d",++i,temp.data);
            temp=temp.next;

        }
    }

    public int rethead() {
        System.out.println();
        System.out.println();
        return head.data;
    }

    public void insertatbeg(int data) {
        Node node=new Node();
        node.data =data;
        if (head == null) {
            node.next=null;
            head=node;

        }
        else {
            node.next=head;
            head=node;

        }
        System.out.printf("Element inserted at First %d\n",data);

    }



    public void inseratlast(int i) {
        Node node=new Node();
        node.data =i;
        if (head == null) {
            node.next=null;
            head=node;

        }
        Node temp=head;

        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        node.next=null;
        System.out.printf("Element inserted at last %d\n",i);

    }

    public void insertatspef(int data, int loc) {
        Node node=new Node();
        node.data=data;
        if (head == null) {
            node.next=null;
            head=node;

        }
        else {
            Node temp = head;
            int i = 0;
            for (; i <loc-1; i++) {
                temp = temp.next;
            }

            node.next = temp.next;
            temp.next = node;
            System.out.println();
            System.out.printf("Element inserted at %d\n", i+1);
            System.out.println(node.data+ " Inserted");

        }

    }

    public int search(int i) {
        int flag=999;
        if (head==null){
            System.out.println("List is empty");
        }
        else {
            int j=0;

            Node temp=head;
            while (temp!=null){
                if (temp.data==i){
                    System.out.println("Element found at "+j+"th index");
                    flag=1;
                    return j;
                }
                temp=temp.next;
                j++;
            }
            if (flag==999){
                System.out.println("Element not found");

            }

        }
        return flag;
    }

    public void delete(int data) {
        int loc=search(data);
        Node temp=head;
        Node temp1=temp.next;
        for (int i=0;i<loc-1 ;i++){
            temp=temp1;
            temp1=temp1.next;

        }
        System.out.println("Temp 1"+temp1.data);
        System.out.println("Temp 0"+temp.data);
        temp.next=temp1.next;



    }
}