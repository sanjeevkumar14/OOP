package constructor;

public class UseAccount {
    public static void main(String[] args) {

        Account obj=new Account();
        obj.showAccount();
        Account obj2=new Account(102,"Priya Yadav ",5000);
        obj2.showAccount();
    }
}
