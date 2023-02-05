package constructor;

public class Account {
    private int accId;
    private String name;
    private double balance;

            //Constructor are one of the best way to properly initialize the object.

    public Account(){   //Default Constructor
        System.out.println("Default constructor is Called");
        accId=20031022;
        balance=26200;
        name="Sanjeev Yadav";
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
