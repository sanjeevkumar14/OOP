package StaticKeyword;

import java.util.Scanner;

/*
Q. Suppose we have to create a class called account for a banking application, which shows accId, name, balance
   and rateOfInterest for a customer.

   The challenge is that our code should accept rateOfInterest automatically at runtime and only once.

   How can we achieve ths?
 */
class Account {
    private int accId;
    private String name;
    private double balance;


    public Account(){   //Default Constructor
        System.out.println("Default constructor is Called");
        accId=20031022;
        balance=26200;
        name="Sanjeev Yadav";
    }

    private static double rateOfInt;
    static {
        System.out.println("Enter rate of Interest: ");
        Scanner kb=new Scanner(System.in);
        rateOfInt = kb.nextDouble();
    }
    public Account(int id,String n,double bal){   //Parameterized Constructor
        accId=id;
        name=n;
        balance=bal;
    }

    public void showAccount(){
        System.out.println("Id: "+accId);
        System.out.println("Name: "+name);
        System.out.println("Balance: "+balance);
    }
}
public class StaticBlockInJava {

    public static void main(String[] args) {
        Account obj=new Account();
        obj.showAccount();
        Account obj2=new Account(102,"Priya Yadav ",5000);
        obj2.showAccount();
    }
}
