public class AreaCalculator {
    public static void main(String[] args) {
        double pole = area (5.0);
        System.out.println(pole);
        double pole2= area(5, 6);
        System.out.println(pole2);

    }
    public static double area(double radius) {
        if(radius < 0) {
            return -1;
        }
        double PI = 3.14159;
        double area = radius * radius * PI;
        return area;
    }
    public static double area(double x, double y) {
        if(x < 0 || y < 0) {
            return -1;
        }
        double area = x * y;
        return area;
    }
}
