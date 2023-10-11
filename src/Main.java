public class Main {
    public static void main(String[] args) {
        Vector A = new Vector (3,4);
        Vector B = new Vector (6,8);
        System.out.println("A " + A.toString());
        System.out.println("B " + B.toString());
        Vector C = new Vector();
        Vector D = new Vector();
        C = C.add(A,B);
        D = D.sub(A,B);

        System.out.println("Длина вектора: %.2f".formatted (A.length(B)));
        System.out.println("Сумма " + C.toString());
        System.out.println("Разность " + D.toString());
        System.out.println("Скалярное произведение веторов А и B: " + Vector.mulSkalar(A,B));



    }
}