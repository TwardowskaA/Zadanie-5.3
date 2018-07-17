public class Program {

    public static void main(String[] args) {


        double x = 0;

        while (x <= 3.1) {
            System.out.printf("%.1f . ", x);
            x = x + 0.1;
        }

        double y = 0;
        do {
            System.out.println();
            System.out.printf("%.1f", y);
            y = y + 0.1;
        } while (y <= 3.1);
    }
}