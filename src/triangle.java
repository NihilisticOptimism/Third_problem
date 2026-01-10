public class triangle {
    private double a;
    private double b;
    private double c;

    public triangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new RuntimeException("There is no figure with such parameters.");
        }
        double s1 = a + b;
        double s2 = a + c;
        double s3 = b + c;
        if (s1 <= c || s2 <= b || s3 <= a) {
            throw new RuntimeException("There is no figure with such parameters.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    public double getPerimeter() {
        return a + b + c;
    }
}