class A{
    void  run(){
        System.out.println("Hi  Guys");
    }
}
class B extends A{
    void run(){
        System.out.println("Hello Guys");
        super.run();
    }
}
public class RunPoly {
    public static void main(String[] args) {
        A b = new B();
        b.run();
    }
}
