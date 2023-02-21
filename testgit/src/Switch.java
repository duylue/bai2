import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

//        if (x == 1) {
//            System.out.println("so 1");
//        } else if (x == 2) {
//
//            System.out.println("so 2");
//        } else {
//            System.out.println("nhung so khac");
//        }
//

        switch (x) {
            case 1:
                System.out.println("------------------------------------------------ chu nhat");
                break;
            case 2:
                System.out.println(" ---------------------------------------------------thu 2");
                break;

            case 3:
                System.out.println(" ---------------------------------------------------thu 3");
                break;
            case 4:
                System.out.println("------------------------------------------------thu 4");
                break;
            case 5:
                System.out.println(" ---------------------------------------------------thu 5");


            case 6:
                System.out.println(" ---------------------------------------------------thu 6");
                break;
            case 7:
                System.out.println(" ---------------------------------------------------thu 7");
                break;
            default:
                System.out.println(" ----------------------------- khong phai thu");
        }
    }
}
