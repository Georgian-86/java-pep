package Day_2;
import java.awt.*;

public class point {
    public static void main(String[] args){

        Point p1 = new Point(1, 2);
        Point p2 = p1;
        System.out.println(p1.equals(p2));
        p1.x = 2;
        System.out.println(p2);

        String name = "Goluuu";
        System.out.println(name.endsWith("uuuu"));

    }
}
