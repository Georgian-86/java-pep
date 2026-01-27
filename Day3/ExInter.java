interface A{
    void methodA();
}
interface B extends A{
    // void methodA();
    default void methodB(){
        System.out.println("This is default methodB from interface B");
    }
}
class C implements B{

    public void methodA(){
        System.out.println("Implementation of methodA from interface A");
    }
    public void methodB(){
        System.out.println("Implementation of methodB from class C");
        B.super.methodB();
        
    }
}
public class ExInter {
    public static void main(String[] args) {
        C c = new C();
        //c.methodA();
        c.methodB();
    }
}
