import java.util.Date;
import java.util.Scanner;

public class Bnk {
    public static void main(String[] args) {
        Account[] acc=new Account[3];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<acc.length;i++){
            System.out.println("Enter Ur Name");
            acc[i]=new Account(i, 0, 5, sc.next());
        }
        System.out.println("Your id");
        int num= sc.nextInt();
        for (int i=0;i< acc.length;i++){
            if (num==acc[i].getId()){

                int n=0;
                while (n!=4) {
                    System.out.println();
                    System.out.println("Enter available options to continue");
                    System.out.println("1.Withdraw Cash");
                    System.out.println("2.Deposit money\n3.Account details\n4.Exit");
                    n = sc.nextInt();

                    switch (n) {
                        case 1:
                            System.out.println("Enter money to withdraw");
                            int u=sc.nextInt();
                            acc[i].withdraw(u);
                            break;
                        case 2:
                            System.out.println("Enter how much money you deposit");
                            int o=sc.nextInt();
                            acc[i].deposit(o);
                            break;
                        case 3:
                            System.out.println("Account Holder name:"+acc[i].getName());
                            System.out.println("Account id:"+acc[i].getId());
                            System.out.println("Account balance:"+acc[i].getBalance());
                            System.out.println("Account created on:"+acc[i].getDatecreated());
                            System.out.println(" ");
                            System.out.println("Account Holder name:"+acc[i].getName());
                            break;
                        case 4:
                            System.out.println("Exiting");
                            break;



                    }
            }
        }
    }





}

static class Account {
    private int id;
    private double balance;
    private double annualintrestrate;
    private Date datecreated;
    private String name;

    public Account(int id, double balance, double annualintrestrate, String name) {
        this.balance = balance;
        this.annualintrestrate = annualintrestrate;
        this.id = id;
        this.datecreated = new Date();
        this.name = name;

    }

    public boolean withdraw(double balance) {
        if (balance > this.balance) {
            return false;
        } else {
            this.balance -= balance;
            return true;
        }

    }

    public void deposit(double balance) {
        this.balance += balance;
        System.out.println("YOur current balance is " + getBalance());

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualintrestrate() {
        return annualintrestrate;
    }

    public void setAnnualintrestrate(double annualintrestrate) {
        this.annualintrestrate = annualintrestrate;
    }

    public Date getDatecreated() {
        return datecreated;
    }

    public String getName() {
        return name;
    }
}}


