public class AreaCalculator {

    public static final int ERROR_MESAGE = -1;

    public static double area(double radius) {
        if (radius < 0) {
            return ERROR_MESAGE;
        }
        return (Math.PI * Math.pow(radius, 2));
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return ERROR_MESAGE;
        }
        return (x * y);
    }
}
