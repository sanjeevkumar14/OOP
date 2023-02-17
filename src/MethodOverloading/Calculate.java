package MethodOverloading;

public class Calculate {
    int add(int a,int b){
        return a+b;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }

    int add(int a,int b,int c,int d){
        return a+b+c+d;
    }

    double add(double a, double b){
        return a+b;
    }

    double add(int a, double b){
        return a+b;
    }
    String add(String d,String a){
        return d+a;
    }
}

class Main{
    public static void main(String[] args) {
        Calculate c=new Calculate();
        System.out.println(c.add(1,2));
        System.out.println(c.add(1,2,3));
        System.out.println(c.add(1,2,4,5));
        System.out.println(c.add(1.0,2));
        System.out.println(c.add("Sanjeev ","Yadav"));
        System.out.println(c.add(5,3.6));

    }
}
