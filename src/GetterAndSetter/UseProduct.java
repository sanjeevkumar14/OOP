package GetterAndSetter;

public class UseProduct {
    public static void main(String[] args) {
        Product p=new Product();
        p.setId(100);
        p.setName("Sanjeev Kumar Yadav");
        p.setPrice(1000);

        System.out.println(p.getId());
        System.out.println(p.getName());
        System.out.println(p.getPrice());
    }
}
