
/*class human{

    human(){
        age = 10;
        name = "Ankit";
    }

    human(int age,String name){
        this.age = age;
        this.name = name;
    }
    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

   
    
      human h = new human();
        human h1 = new human(78,"vinayak");
        System.out.println(h.getAge());
        System.out.println(h.getName());

        System.out.println(h1.getAge());
        System.out.println(h1.getName());

}*/

// this and super key
/**
 * a
 */
 class a
  {

    a(){
        System.out.println("i am in a class");
    }

    a(int n){
        this();
        System.out.println("i am in a class with variable");
    }


    
}

class b extends a
{
    b(){
        
        System.out.println("i am in b class");
    }

    b(int n){
        super(n);
        System.out.println("i am in b in class with one variable");
    }
}
public class temp {
    public static void main(String[] args) {
      
        b obj = new b(7);
    }
}