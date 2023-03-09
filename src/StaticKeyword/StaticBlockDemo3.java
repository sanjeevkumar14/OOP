package StaticKeyword;

class  Data{
    static int a=10;
    int b=20;
    static {
        System.out.println("First Static Block is called... "+a);
    }
    static {
        System.out.println("Second Static Block is called ");
//        System.out.println("Second Static Block is called "+b);//error bcz b is an instance variable...
    }
    public Data(){
        System.out.println("Constructor is called ");
    }

    public static void show(){
        System.out.println("Show is called");
    }
}

public class StaticBlockDemo3 {
    public static void main(String[] args) {
        System.out.println("Hello");
        Data.show();
        Data.show();

        Data d1= new Data();
        Data d2= new Data();
        Data d3= new Data();

    }
}


/* output:------------------------
Hello
First Static Block is called... 10
Second Static Block is called
Show is called
Show is called
Constructor is called
Constructor is called
Constructor is called
 */
