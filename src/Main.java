import java.util.Scanner;

/**
 * Created by mb977 on 10/6/16.
 */
public class Main {
    public static void main(String[] args) {
        //write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of your circle");
        double q = input.nextDouble();

        circle cir1 = new circle(q);

        double area = cir1.area();
        System.out.println(area);

        double circ = cir1.hi();
        System.out.println(circ);
    }
}
