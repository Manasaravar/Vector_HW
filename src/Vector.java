public class Vector {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x1, double x2) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector() {
        this.x = x;
        this.y = y;
        }

    public double length(Vector A) {
        return Math.sqrt(Math.pow(this.x - A.x, 2) + Math.pow(this.y - A.y, 2));
    }

    public Vector add (Vector A, Vector B) {
        return new Vector(A.getX() + B.getX(), A.getY() + B.getY());
    }
    public Vector sub (Vector A, Vector B) {
        return new Vector(A.getX() - B.getX(), A.getY() - B.getY());
    }
    public static double mulSkalar (Vector A, Vector B) {
        return A.x * B.x + A.y * B.y;
    }
    public String toString() {
        String str = ("Vector (x = " + x + ", y = " + y + ")");
        return str;
    }
}
