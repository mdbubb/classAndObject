/**
 * Created by mb977 on 10/6/16.
 */
public class circle {
    public double radius;

    public circle(double r)

    {
        radius = r;

    }


    public double area() {
        double a = Math.PI * radius * radius;
        return a;
    }

    public double hi() {
        double b = 2 * Math.PI * radius;
        return b;

    }
}
