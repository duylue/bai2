import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a");
        float a = scanner.nextFloat();
        System.out.println("Nhap b");
        float b = scanner.nextFloat();
        double z =Math.sqrt(a);
        float x;
        if (a != 0) {
            x = -b / a;
            System.out.println("pt co nghiem la : " + x);

        } else {
            if (b == 0) {
                System.out.println("Pt vo so nghiem");
            } else {
                System.out.println("Pt vo nghiem");
            }

        }


    }


}
