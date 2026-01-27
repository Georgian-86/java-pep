interface Payment{
    void pay(int amount);
}
interface Balance{
    void pay(int amount);
    int getBalance();
    default void show(){
        System.out.println("This is a default method in Balance interface");
    }
}
class Upi implements Payment,Balance{
    public void pay(int amount){
        System.out.println("Paid via UPI : "+amount);
    }
    public int getBalance(){
        return 1000;
    }
}
public class ExampleInterfaces {
    public static void main(String[] args) {
        Upi u = new Upi();
        u.pay(500);
        int bal = u.getBalance();
        System.out.println("Current Balance : "+bal);
    }
}
