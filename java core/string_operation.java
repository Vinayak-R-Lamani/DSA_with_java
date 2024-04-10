class Mobile{
    int price;
    String brand;
    static String name;
    public void show(){
        System.out.println(price +" : " + brand+" : "+name);
    }
}
public class string_operation {
    public static void main(String[] args) {
        // string are immutable
        // convert to string to mutable use String Buffer
        // StringBuffer sb= new StringBuffer("hello");
        // String str = sb.toString();
        // System.out.println(str);
        Mobile  m = new Mobile();
        m.price = 230000;
        m.brand = "Apple";

        Mobile  m1 = new Mobile();
        m1.price = 130000;
        m1.brand = "Oneplus";

        Mobile.name = " smartphone";

        m.show();
        m1.show();


    }
}
