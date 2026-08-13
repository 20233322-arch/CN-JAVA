import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap canh a: ");
        double a = sc.nextDouble();

        System.out.print("Nhap canh b: ");
        double b = sc.nextDouble();

        System.out.print("Nhap canh c: ");
        double c = sc.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Ba so do khong phai la 3 canh cua tam giac.");
        } else if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Ba so do khong tao thanh tam giac.");
        } else {
            if (a == b && b == c) {
                System.out.println("Day la tam giac deu.");
            } else if (a == b || a == c || b == c) {
                System.out.println("Day la tam giac can.");
            } else if (a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a) {
                System.out.println("Day la tam giac vuong.");
            } else {
                System.out.println("Day la tam giac thuong.");
            }
        }

        sc.close();
    }
}
