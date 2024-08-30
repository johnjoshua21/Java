import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.Stack;

public class Listarr {
        static Scanner sc=new Scanner(System.in);
        static int total=0;
         static ArrayList<String> order=new ArrayList<>();
        public static void main(String[] args) {

            int n=0;

            while (n!=4){

                System.out.println("Choose an option for great meals");
                System.out.println("1.Order a meal\n2.Remove\n3.Display\n4.Exit");
                n= sc.nextInt();
                switch (n){
                    case 1:
                        Adding();
                        break;

                    case 2:
                        System.out.println("Delete ur order");
                        order.remove(sc.next());
                        break;

                    case 3:
                        System.out.println("Ur orders");
                        System.out.println(order);
                        break;

                    case 4:
                        System.out.println("Exiting");
                        break;


                }

            }
        }

        public static void Adding(){
            System.out.println("Available items");
            System.out.println("Snacks");
            System.out.println("1.Pizza\n2.Burger\n3.Momo\n4.Fries\n5.Sandwich\n6.Roll\n7.Popcorn\n8.Pasta\n9.Ice Cream\n10.Fried Chicken");
            int x=sc.nextInt();
            switch (x){
                case 1:
                    System.out.println("1.Chicken Pizza-Large:$499");
                    System.out.println("2.Chicken Pizza-Small:$299");
                    System.out.println("3.Cheese pizza:$149");
                    System.out.println("4.Pepporoni pizza:$199");
                    System.out.println("5.Regular pizza:$99");
                    int p= sc.nextByte();
                    if (p==1){
                        total+=499;
                        order.add("Chicken Pizza-Large");
                        System.out.println("Your Orders:"+order);
                        System.out.println("Total Cost:$"+total);

                    } else if(p==2) {
                        total+=299;
                        order.add("Chicken Pizza-Small");
                        System.out.println("Your Orders:$"+order);
                    } else if (p==3) {
                        total+=149;
                        order.add("Cheese Pizza");
                        System.out.println("Your Orders:$"+order);
                    } else if (p==4) {
                        total+=199;
                        order.add("Pepporoni Pizza");
                        System.out.println("Your Orders:$"+order);
                    } else {
                        total+=99;
                        order.add("Regular");
                        System.out.println("Your Orders:$"+order);
                    }



            }

        }





    }


